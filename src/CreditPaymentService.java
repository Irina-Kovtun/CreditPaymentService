public class CreditPaymentService {
public double calculate(int credit, int term) {
    float rate = 9.99f;
    double monthly_rate = rate / 100 / 12;
    double monthly_payment = credit * (monthly_rate + monthly_rate / (Math.pow((1 + monthly_rate),term) - 1));
    return monthly_payment;
}
}

