public class MathUtility {
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0; 
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] numberArray = { 5.5, 10.0, 15.5, 20.0, 25.5 };


        double average = MathUtility.calculateAverage(numberArray);

        System.out.println("Average: " + average);
    }
}