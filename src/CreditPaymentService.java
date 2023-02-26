
public class CreditPaymentService {
    public int calculate(double credit, double term, double rate) {

        double monthlyRate; // ежемесячная процентная ставка
        monthlyRate = rate / 100 / 12;
        double formula = 1 + monthlyRate;
        double exponentiation = Math.pow(formula, term); // возведение числа в степень, равную количеству месяцев кредита
        double result;
        result = credit * (monthlyRate + (monthlyRate / (exponentiation - 1))); // ежемесячный платеж
        int totalResult = (int) result;
        return totalResult;

    }
}