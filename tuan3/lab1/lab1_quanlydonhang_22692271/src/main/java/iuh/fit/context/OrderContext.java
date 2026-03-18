package iuh.fit.context;
import iuh.fit.decorator.Order;
import iuh.fit.state.NewOrderState;
import iuh.fit.state.OrderState;

public class OrderContext {
    private OrderState currentState;
    private Order order;

    public OrderContext(Order order) {
        this.order = order;
        this.currentState = new NewOrderState(); // Mặc định là đơn mới
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public Order getOrder() {
        return order;
    }

    public void proceed() {
        currentState.handle(this);
    }
}