public class FruitsBasket2 {

    public static int totalFruit(char[] fruits) {
        HashMap<Character, Integer> basket = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            char fruit = fruits[right];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);

            while (basket.size() > 2) {
                char leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        char[] fruits = {'A', 'B', 'C', 'A', 'C'};
        System.out.println("Longest subarray length: " + totalFruit(fruits));  
    }
    
}
