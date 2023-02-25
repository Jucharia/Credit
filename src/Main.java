public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double rate = 9.99;
        int term = 12;
        int payment = service.calculate(credit, term, rate); // получается 87911 руб
        System.out.println(payment);

        System.out.println();
        term = 24;
        payment = service.calculate(credit, term, rate); // получается 46140 руб ежемесячный платеж
        System.out.println(payment);

        System.out.println();
        term = 36;
        payment = service.calculate(credit, term, rate); // получается ежемесячный платеж 32262 руб
        System.out.println(payment);
    }
}