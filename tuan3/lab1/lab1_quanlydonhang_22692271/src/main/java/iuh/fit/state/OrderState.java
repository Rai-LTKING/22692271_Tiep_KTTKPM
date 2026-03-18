package iuh.fit.state;

import iuh.fit.context.OrderContext;

public interface OrderState {
    void handle(OrderContext context);
}