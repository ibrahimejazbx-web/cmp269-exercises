import java.util.ArrayList;

public class PaymentSystem {
    public static void main(String[] args) {
        ArrayList<Payable> paymentQueue = new ArrayList<>();

        paymentQueue.add(new CreditCard("Alex", 100.0, 200.0));
        paymentQueue.add(new MealPlan("Jamie", 75.0));

        for (Payable p : paymentQueue) {
            p.processPayment(50.0);
        }

        System.out.println("Total Transactions: " + PaymentMethod.totalTransactions);
    }
}
