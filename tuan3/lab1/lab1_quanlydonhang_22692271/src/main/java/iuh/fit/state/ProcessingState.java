package iuh.fit.state;

import iuh.fit.context.OrderContext;

public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("STATE: [Đang xử lý] -> Đang đóng gói và gửi cho đơn vị vận chuyển.");
        context.setState(new DeliveredState());
    }
}