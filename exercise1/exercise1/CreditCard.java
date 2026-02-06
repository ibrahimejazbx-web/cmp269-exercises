public class CreditCard extends PaymentMethod {
    private double creditLimit;
    private String status = "Pending";

    public CreditCard(String accountHolder, double balance, double creditLimit) {
        super(accountHolder, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void processPayment(double amount) {
        if (amount > balance + creditLimit) {
            status = "Transaction Declined";
            System.out.println(status);
        } else {
            balance -= amount;
            totalTransactions++;
            status = "Payment Approved";
        }
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    void validateAccount() {
    }
}
