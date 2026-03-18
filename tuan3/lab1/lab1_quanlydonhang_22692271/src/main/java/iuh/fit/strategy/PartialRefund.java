package iuh.fit.strategy;

public class PartialRefund implements RefundStrategy {
    @Override
    public void refund(double amount) {
        System.out.println(">> STRATEGY: Đã thực hiện hoàn tiền 50% (Phí hủy): $" + (amount * 0.5));
    }
}