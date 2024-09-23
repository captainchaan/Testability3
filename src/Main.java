public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int month1 = 12;
        int month2 = 24;
        int month3 = 36;


        System.out.println("\nЕжемесячный платеж за год  = " + service.calculate(credit, month1));

        System.out.println("\nЕжемесячный платеж за два года = " + service.calculate(credit, month2));

        System.out.println("\nЕжемесячный платеж за три года = " + service.calculate(credit, month3));

    }
}
