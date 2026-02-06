public class MealPlan extends PaymentMethod {
    private String status = "Pending";

    public MealPlan(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void validateAccount() {
        if (balance < 0) {
            balance = 0;
        }
    }

    @Override
    public void processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            totalTransactions++;
            status = "Meal Payment Successful";
        } else {
            status = "Insufficient Meal Plan Balance";
            System.out.println(status);
        }
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }
}
