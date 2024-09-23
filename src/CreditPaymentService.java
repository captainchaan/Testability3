public class CreditPaymentService {
    public int calculate(int credit, int month) {
        double annualRate = 0.0999; // Процентная ставка
        double monthlyRate = annualRate / 12;  // Высчитываем ежемесячную процентную ставку
        double monthlyPayment = credit * (monthlyRate + (monthlyRate / (Math.pow(1 + monthlyRate, month) - 1)));
        return (int) monthlyPayment;
    }
}