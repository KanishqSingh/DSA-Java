from collections import deque

def water_jug_bfs(m, n, d):
    # Initial state (0,0)
    start = (0, 0)
    visited = set([start])
    queue = deque([(start, [])])  # (state, path)

    while queue:
        (a, b), path = queue.popleft()

        # If goal is reached
        if a == d or b == d:
            return path + [(a, b)]

        # Possible next states
        next_states = [
            (m, b),   # Fill jug1
            (a, n),   # Fill jug2
            (0, b),   # Empty jug1
            (a, 0),   # Empty jug2
            (a - min(a, n - b), b + min(a, n - b)),  # Pour jug1 → jug2
            (a + min(b, m - a), b - min(b, m - a))   # Pour jug2 → jug1
        ]

        for state in next_states:
            if state not in visited:
                visited.add(state)
                queue.append((state, path + [(a, b)]))

    return None  # No solution


# Example usage
if __name__ == "__main__":
    m, n, d = 4, 3, 2   # Jug1=4L, Jug2=3L, Goal=2L
    solution = water_jug_bfs(m, n, d)

    if solution:
        print("Solution Path:")
        for step in solution:
            print(step)
    else:
        print("No solution possible")
