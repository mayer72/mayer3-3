public class CreditPaymentService {
    public int calculate(int term, int credit) {
        double sum;
        double percent = 9.99;
        double x = Math.pow((1 + (percent / 12 / 100)), term * 12);
        sum = credit * (percent / 12 / 100) * x / (x - 1);
        return (int) sum;
    }

}
