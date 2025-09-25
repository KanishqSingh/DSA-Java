import heapq

# Manhattan Distance Heuristic
def manhattan(state, goal):
    distance = 0
    for i in range(1, 9):  # tile numbers 1–8
        x1, y1 = divmod(state.index(i), 3)
        x2, y2 = divmod(goal.index(i), 3)
        distance += abs(x1 - x2) + abs(y1 - y2)
    return distance

# Generate neighbors by sliding the blank (0)
def get_neighbors(state):
    neighbors = []
    idx = state.index(0)  # position of blank
    x, y = divmod(idx, 3)

    moves = [(-1,0), (1,0), (0,-1), (0,1)]  # Up, Down, Left, Right
    for dx, dy in moves:
        nx, ny = x + dx, y + dy
        if 0 <= nx < 3 and 0 <= ny < 3:
            new_idx = nx * 3 + ny
            new_state = list(state)
            # Swap blank with neighbor
            new_state[idx], new_state[new_idx] = new_state[new_idx], new_state[idx]
            neighbors.append(tuple(new_state))
    return neighbors

# A* Algorithm
def astar(start, goal):
    pq = []  # priority queue
    heapq.heappush(pq, (0 + manhattan(start, goal), 0, start, []))  
    visited = set()

    while pq:
        f, g, state, path = heapq.heappop(pq)

        if state in visited:
            continue
        visited.add(state)

        if state == goal:
            return path + [state]

        for neighbor in get_neighbors(state):
            if neighbor not in visited:
                new_g = g + 1
                new_f = new_g + manhattan(neighbor, goal)
                heapq.heappush(pq, (new_f, new_g, neighbor, path + [state]))

    return None

# Example usage
if __name__ == "__main__":
    start = (1, 2, 3,
             4, 0, 6,
             7, 5, 8)   # Initial state

    goal = (1, 2, 3,
            4, 5, 6,
            7, 8, 0)   # Goal state

    solution = astar(start, goal)

    if solution:
        print("Solution found in", len(solution)-1, "moves:")
        for step in solution:
            for i in range(0, 9, 3):
                print(step[i:i+3])
            print()
    else:
        print("No solution possible.")
