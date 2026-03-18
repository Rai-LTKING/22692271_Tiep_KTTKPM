package iuh.fit.decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(Order order) {
        super(order);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25.0; // Thêm phí bảo hiểm 25$
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [+ Bảo hiểm hàng hóa]";
    }
}