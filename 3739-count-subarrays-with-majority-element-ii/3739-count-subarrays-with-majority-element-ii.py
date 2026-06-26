from typing import List

class Solution:
    def countMajoritySubarrays(self, nums: List[int], target: int) -> int:
        # Step 1: Build the prefix sums array (our historical timeline of scores)
        # We start with [0] because the score is 0 before the game begins.
        prefix_sums = [0]
        curr_sum = 0
        for num in nums:
            curr_sum += 1 if num == target else -1
            prefix_sums.append(curr_sum)
            
        # Step 2: Use a helper function to count pairs where a later score 
        # is strictly greater than an earlier score.
        def merge_and_count(arr):
            if len(arr) <= 1:
                return 0, arr
            
            mid = len(arr) // 2
            # Split and count inside the left and right halves
            left_count, left_sorted = merge_and_count(arr[:mid])
            right_count, right_sorted = merge_and_count(arr[mid:])
            
            # Count across the split (where a left element is smaller than a right element)
            cross_count = 0
            j = 0
            for i in range(len(left_sorted)):
                while j < len(right_sorted) and right_sorted[j] <= left_sorted[i]:
                    j += 1
                # If right_sorted[j] is greater than left_sorted[i], 
                # then ALL remaining elements in right_sorted are also greater!
                cross_count += len(right_sorted) - j
                
            # Merge the two halves back together cleanly
            merged = sorted(left_sorted + right_sorted)
            return left_count + right_count + cross_count, merged

        total_valid_subarrays, _ = merge_and_count(prefix_sums)
        return total_valid_subarrays