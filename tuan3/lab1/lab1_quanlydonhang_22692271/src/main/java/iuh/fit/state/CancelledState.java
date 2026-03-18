package iuh.fit.state;

import iuh.fit.context.OrderContext;
import iuh.fit.strategy.RefundStrategy;

public class CancelledState implements OrderState {
    private RefundStrategy refundStrategy;

    public CancelledState(RefundStrategy strategy) {
        this.refundStrategy = strategy;
    }

    @Override
    public void handle(OrderContext context) {
        System.out.println("STATE: [Hủy] -> Đang thực hiện các thủ tục hủy đơn.");
        refundStrategy.refund(context.getOrder().getCost());
    }
}