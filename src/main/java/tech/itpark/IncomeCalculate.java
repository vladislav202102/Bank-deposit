package tech.itpark;

public class IncomeCalculate {

        public int calculate(int sum) {
        int percent = 3;
        int income = sum * percent / 100;

        int minSum = 1_000;
        if (sum < minSum) {
            income = 0;

        }

        return income;
    }
}