class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        unique_num=list(set(arr))
        rank={}
        curr=1
        for num in sorted(unique_num):
            rank[num]=curr
            curr+=1
        result=[]
        for num in arr:
            result.append(rank[num])

        return result    
