class Solution:
    def zigZagArrays(self, n: int, l: int, r: int) -> int:
        MOD = 10**9 + 7
        # M is our shifted 1-indexed range
        M = r - l + 1
        
        # Base cases for very short arrays
        if n == 1:
            return M % MOD
        if n == 2:
            return (M * (M - 1)) % MOD
            
        # DP tables for the previous step
        endsUp = [0] * (M + 1)
        endsDown = [0] * (M + 1)
        
        # Initialize the state for length 2 sequences
        for k in range(1, M + 1):
            endsUp[k] = k - 1
            endsDown[k] = M - k
            
        # Build sequences step-by-step up to length n
        for i in range(3, n + 1):
            newEndsUp = [0] * (M + 1)
            newEndsDown = [0] * (M + 1)
            
            # Calculate EndsUp using a running Prefix Sum of EndsDown
            pref = 0
            for k in range(1, M + 1):
                newEndsUp[k] = pref
                pref = (pref + endsDown[k]) % MOD
                
            # Calculate EndsDown using a running Suffix Sum of EndsUp
            suff = 0
            for k in range(M, 0, -1):
                newEndsDown[k] = suff
                suff = (suff + endsUp[k]) % MOD
                
            # Move our new states to the primary tables for the next loop
            endsUp = newEndsUp
            endsDown = newEndsDown
            
        # Tally up all valid sequences of length n
        ans = 0
        for k in range(1, M + 1):
            ans = (ans + endsUp[k] + endsDown[k]) % MOD
            
        return ans