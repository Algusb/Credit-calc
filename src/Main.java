public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println((int) (service.calculate(1000000, 12, 9.99F)));
        System.out.println("Платеж при кредите 1 год");


        System.out.println();
        System.out.println((int) (service.calculate(1000000, 24, 9.99F)));
        System.out.println("Платеж при кредите 2 год");

        System.out.println();
        int monthPayment = (int) service.calculate(1000000, 36, 9.99F);
        System.out.println(monthPayment);
        System.out.println("Платеж при кредите 3 год");

    }
}
