package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        // Implement the program that will find the greatest number from two
        // that are passed as parameters to the method and print the greatest.
        // In case of equality print any of them. Implement program in the code snippet:
        int max;
        max = first >= second ? first : second;
        System.out.println(max);
    }
}
