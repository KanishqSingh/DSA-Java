from collections import deque

# BFS function
def bfs(graph, start):
    visited = set()          # To keep track of visited nodes
    queue = deque([start])   # Initialize queue with start node
    
    while queue:
        node = queue.popleft()   # Pop from the front of the queue
        if node not in visited:
            print(node, end=" ")  # Process the node
            visited.add(node)     # Mark as visited
            
            # Add all unvisited neighbors to the queue
            for neighbor in graph[node]:
                if neighbor not in visited:
                    queue.append(neighbor)

# Example usage
if __name__ == "__main__":
    # Graph represented as adjacency list (dictionary)
    graph = {
        'A': ['B', 'C'],
        'B': ['D', 'E'],
        'C': ['F'],
        'D': [],
        'E': ['F'],
        'F': []
    }

    print("BFS Traversal starting from A:")
    bfs(graph, 'A')
