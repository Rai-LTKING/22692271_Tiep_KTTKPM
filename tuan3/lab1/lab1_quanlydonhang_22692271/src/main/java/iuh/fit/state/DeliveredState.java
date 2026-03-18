package iuh.fit.state;

import iuh.fit.context.OrderContext;

public class DeliveredState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("STATE: [Đã giao] -> Cập nhật trạng thái thành công. Kết thúc quy trình.");
    }
}