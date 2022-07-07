public class CreditPaymentService {
    public float calculate(float a, float b, float c) {
        // a - сумма кредита, b - количество месяцев, c - годовая процентная ставка
        float c1 = c / 1200;
        float b1 = 1 + c1;
        float b2 = (float) Math.pow(b1, b);
        float b3 = b2 - 1;
        float c2 = c1 / b3;
        float c3 = c1 + c2;
        float result = a * c3;
        return result;
    }
}
