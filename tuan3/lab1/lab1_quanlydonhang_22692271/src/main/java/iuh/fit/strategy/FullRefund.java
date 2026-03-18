package iuh.fit.strategy;

public class FullRefund implements RefundStrategy {
    @Override
    public void refund(double amount) {
        System.out.println(">> STRATEGY: Đã thực hiện hoàn tiền 100%: $" + amount);
    }
}