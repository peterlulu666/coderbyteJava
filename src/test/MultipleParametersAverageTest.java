package test;

class MultipleParametersAverageTest {
    static double average(double... array) {
        double average = 0.0;
        double sum = 0.0;
        if (array.length != 0) {
            for (double data : array) {
                sum = sum + data;

            }
        }
        average = sum / array.length;
        return average;

    }

    public static void main(String... args) {
        System.out.println(average(1, 2, 3));

    }
}