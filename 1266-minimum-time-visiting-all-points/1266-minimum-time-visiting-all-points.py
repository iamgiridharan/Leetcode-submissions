class Solution:
    def minTimeToVisitAllPoints(self, points: list[list[int]]) -> int:
        steps = 0

        for i in range(len(points)-1):
            x1 = points[i][0]
            y1 = points[i][1]
            
            x2 = points[i+1][0]
            y2 = points[i+1][1]

            dx = abs(x2 - x1)
            dy = abs(y2 - y1)

            steps += min(dx, dy) + abs(dx - dy)
        return steps    


