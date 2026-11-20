class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        def bfs(r,c):
            search_queue = deque()
            visited.add((r,c))
            search_queue.append((r,c))
            while search_queue:
                row ,col = search_queue.popleft()
                directions = [[1,0], [-1,0], [0,1], [0,-1]]
                for dr, dc in directions:
                    r = row + dr
                    c = col + dc
                    if (r in range(rows) and c in range(cols) and grid[r][c] == '1' and (r,c) not in visited):
                        search_queue.append((r,c))
                        visited.add((r,c))
          
        count = 0
        rows = len(grid)
        cols = len(grid[0])
        visited = set()
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == '1' and (r,c) not in visited:
                    bfs(r,c)
                    count += 1
        return count           