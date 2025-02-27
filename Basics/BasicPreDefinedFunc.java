
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.lang.Math;

public class BasicPreDefinedFunc {
    public static void main(String[] args) {
        System.out.println("=== 1. String Handling ===");
        String str = "Hello World";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Replace: " + str.replace('o', 'a'));

        System.out.println("\n=== 2. Mathematical Functions ===");
        System.out.println("Absolute: " + Math.abs(-10));
        System.out.println("Square Root: " + Math.sqrt(16));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Random Number: " + Math.random());

        System.out.println("\n=== 3. Array Handling ===");
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.println("\n=== 4. Collection Framework ===");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);
        list.remove("Apple");
        System.out.println("After Removal: " + list);

        System.out.println("\n=== 5. List Methods ===");
        list.add("Cherry");
        System.out.println("Get Element: " + list.get(1));
        list.set(1, "Mango");
        System.out.println("Updated List: " + list);

        System.out.println("\n=== 6. Set Methods ===");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("Set Elements: " + set);

        System.out.println("\n=== 7. Map Methods ===");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Bob's Age: " + map.get("Bob"));

        System.out.println("\n=== 8. File Handling ===");
        try {
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            }
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello, Java!");
            writer.close();
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println("File Content: " + reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        System.out.println("\n=== 9. Date and Time ===");
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        System.out.println("\n=== 10. Thread Methods ===");
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread Started");
                Thread.sleep(1000);
                System.out.println("Thread Completed");
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== 11. Exception Handling ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n=== 12. Input and Output ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
