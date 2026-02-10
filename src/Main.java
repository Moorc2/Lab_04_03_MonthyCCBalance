public class Main {
    public static void main(String[] args) {
        double startingCCBalance = 5000.00;
        double interestRate = .17;
        double firstMonthBalance = startingCCBalance + (startingCCBalance * interestRate);
        double secondMonthBalance = firstMonthBalance + (firstMonthBalance * interestRate);

        System.out.println("Your initial card balance is $" + startingCCBalance);
        System.out.println("The interest rate is: " + interestRate + "%");
        System.out.println("Your balance after the first month will be: $" + firstMonthBalance);
        System.out.println("Your balance after the second month will be: $" + secondMonthBalance);

    }
}