package iuh.fit.decorator;

public abstract class OrderDecorator implements Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order order) {
        this.decoratedOrder = order;
    }

    public double getCost() { return decoratedOrder.getCost(); }
    public String getDescription() { return decoratedOrder.getDescription(); }
}