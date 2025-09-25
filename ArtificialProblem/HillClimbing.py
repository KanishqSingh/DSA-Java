import random

def f(x):
    return -(x**2) + 10   # Function to maximize

def hill_climbing(max_iterations=100, step_size=0.1):
    # Start at a random position
    current_x = random.uniform(-10, 10)
    current_value = f(current_x)

    for _ in range(max_iterations):
        # Generate a small neighbor (left or right)
        neighbor_x = current_x + random.choice([-step_size, step_size])
        neighbor_value = f(neighbor_x)

        # If neighbor is better, move there
        if neighbor_value > current_value:
            current_x, current_value = neighbor_x, neighbor_value
        else:
            # Stop when no better neighbor
            break

    return current_x, current_value

# Run example
best_x, best_value = hill_climbing()
print("Best solution found: x =", best_x, ", f(x) =", best_value)
