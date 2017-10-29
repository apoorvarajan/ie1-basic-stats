// MinMaxCalculation.java

public class MinMaxCalculation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[i]);
                return;
            }
        }

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Function to find the minimum value in an array
    private static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Function to find the maximum value in an array
    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
