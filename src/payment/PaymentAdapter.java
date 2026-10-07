package src.payment;

public class PaymentAdapter implements PaymentService {
    private final OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void pay(double amount) {
        oldSystem.makePayment(amount);       
    }
}