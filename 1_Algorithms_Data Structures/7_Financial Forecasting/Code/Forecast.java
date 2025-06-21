public class Forecast {
    // Future Value = (Present Value) × (1 + (Growth Rate))^n
    // The time complexity is O(n) as each call runs in constant time
    // The space complexity is also O(n) due to requiring a call stack for recursion
    public static double forecast(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecast(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // To prevent excessive computation, the formula can be directly used
    // This makes both the time and space complexities as O(1)
    public static double forecastOptimized(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.05;
        int years = 10;

        double futureValue = forecast(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);

        futureValue = forecastOptimized(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years (optimized method): %.2f\n", years, futureValue);
    }
}
