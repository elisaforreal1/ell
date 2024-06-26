public class FizzBuzz {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5 (FizzBuzz)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3 (Fizz)
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5 (Buzz)
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If not divisible by 3 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
