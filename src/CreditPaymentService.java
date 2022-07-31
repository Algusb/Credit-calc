public class CreditPaymentService {
    public float calculate(float amount, float month, float percent) {
        float monthPercent = percent / 1200;
        float monthPercentPlusOne = 1 + monthPercent;
        float timePeriodCoeff = (float) Math.pow(monthPercentPlusOne, month);
        float timePeriodCoeffMinusOne = timePeriodCoeff - 1;
        float coefficient = monthPercent / timePeriodCoeffMinusOne;
        float annuityCoefficient = monthPercent + coefficient;
        float result = amount * annuityCoefficient;
        return result;
    }
}
