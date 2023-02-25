
public class CreditPaymentService {
    public int calculate(double credit, double term, double rate) {

        double a; // ежемесячная процентная ставка
        a = rate / 100 / 12;
        double b = 1 + a;
        double c = Math.pow(b, term); // возведение числа в квадрате(рост)
        double d;
        d = credit * (a + (a / (c - 1)));
        int result = (int) d;
        return result;

    }
}