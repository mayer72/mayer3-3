public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // term  срок кредита
        // credit  сумма кредита
        System.out.println("-------------------------------");
        System.out.println("Ежемесячный платёж " + service.calculate(1, 1000000) + " руб.");
        System.out.println("-------------------------------");
        System.out.println("Ежемесячный платёж " + service.calculate(2, 1000000) + " руб.");
        System.out.println("-------------------------------");
        System.out.println("Ежемесячный платёж " + service.calculate(3, 1000000) + " руб.");
        System.out.println("-------------------------------");

    }
}