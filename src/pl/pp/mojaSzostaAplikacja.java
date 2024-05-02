package pl.pp;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {
        int number = 10; // Możesz zmienić tę liczbę na dowolną, dla której chcesz obliczyć silnię

        // Obliczanie silni iteracyjnie
        long startTimeIterative = System.nanoTime(); // Początkowy czas
        long factorialIterative = calculateFactorialIterative(number);
        long endTimeIterative = System.nanoTime(); // Końcowy czas
        long durationIterative = (endTimeIterative - startTimeIterative); // Czas wykonania w nanosekundach

        // Obliczanie silni rekurencyjnie
        long startTimeRecursive = System.nanoTime(); // Początkowy czas
        long factorialRecursive = calculateFactorialRecursive(number);
        long endTimeRecursive = System.nanoTime(); // Końcowy czas
        long durationRecursive = (endTimeRecursive - startTimeRecursive); // Czas wykonania w nanosekundach

        // Wyświetlanie wyników i czasów wykonania
        System.out.println("Silnia " + number + " obliczona iteracyjnie: " + factorialIterative);
        System.out.println("Czas wykonania (iteracyjnie): " + durationIterative + " nanosekund");

        System.out.println("Silnia " + number + " obliczona rekurencyjnie: " + factorialRecursive);
        System.out.println("Czas wykonania (rekurencyjnie): " + durationRecursive + " nanosekund");
    }

    // Metoda obliczająca silnię iteracyjnie
    private static long calculateFactorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Metoda obliczająca silnię rekurencyjnie
    private static long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }
}
