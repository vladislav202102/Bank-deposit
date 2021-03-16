import tech.itpark.IncomeCalculate;

public class Main {
    public static void main(String[] args){
        IncomeCalculate service = new IncomeCalculate();

        int income = service.calculate(1_000);
        System.out.println(income);
    }
}
