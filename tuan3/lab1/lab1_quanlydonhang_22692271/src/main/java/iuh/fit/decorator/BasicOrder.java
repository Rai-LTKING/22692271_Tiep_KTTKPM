package iuh.fit.decorator;

public class BasicOrder implements Order {
    @Override
    public double getCost() { return 10000.0; } // 10000

    @Override
    public String getDescription() { return "Đơn hàng tiêu chuẩn"; }
}