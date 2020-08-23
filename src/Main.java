public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthly_payment_1year = service.calculate(1_000_000, 12);
        System.out.println( (int)monthly_payment_1year );

        double monthly_payment_2year = service.calculate(1_000_000, 24);
        System.out.println( (int)monthly_payment_2year );

        double monthly_payment_3year = service.calculate(1_000_000, 36);
        System.out.println( (int)monthly_payment_3year );


    }
}
