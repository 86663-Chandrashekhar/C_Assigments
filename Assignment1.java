public class Assignment1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No numbers provided. Please input some positive integers as command line arguments.");
            return;
        }

        // Check if all inputs are valid positive integers
        for (String arg : args) {
            if (!isPositiveInteger(arg)) {
                System.out.println("Invalid input: '" + arg + "' is not a valid positive integer.");
                return;
            }
        }

        // Initialize the maximum with the first integer
        int max = Integer.parseInt(args[0]);

        // Find the maximum integer
        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number is: " + max);
    }

    // Helper method to check if a string is a valid positive integer
    private static boolean isPositiveInteger(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true; }}
