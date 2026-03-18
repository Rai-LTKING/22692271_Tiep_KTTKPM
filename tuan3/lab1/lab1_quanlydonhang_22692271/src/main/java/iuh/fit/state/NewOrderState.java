package iuh.fit.state;

import iuh.fit.context.OrderContext;

public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("STATE: [Mới tạo] -> Đang kiểm tra thông tin khách hàng và tồn kho...");
        context.setState(new ProcessingState()); // Chuyển trạng thái tiếp theo
    }
}