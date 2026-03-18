package com.order;


import iuh.fit.context.OrderContext;
import iuh.fit.decorator.BasicOrder;
import iuh.fit.decorator.InsuranceDecorator;
import iuh.fit.decorator.Order;
import iuh.fit.state.CancelledState;
import iuh.fit.strategy.FullRefund;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- KHỞI TẠO HỆ THỐNG QUẢN LÝ ĐƠN HÀNG ---");

        // 1. Dùng Decorator để tạo đơn hàng có bảo hiểm
        Order myOrder = new InsuranceDecorator(new BasicOrder());
        System.out.println("Mô tả: " + myOrder.getDescription());
        System.out.println("Tổng chi phí: $" + myOrder.getCost());
        System.out.println("------------------------------------------");

        // 2. Sử dụng State Pattern để xử lý vòng đời
        OrderContext context = new OrderContext(myOrder);

        context.proceed(); // Chạy NewOrderState
        context.proceed(); // Chạy ProcessingState

        // Giả sử có sự cố, khách hàng yêu cầu Hủy
        System.out.println("\n--- TÌNH HUỐNG: KHÁCH YÊU CẦU HỦY ĐƠN ---");
        context.setState(new CancelledState(new FullRefund())); // Dùng Strategy hoàn tiền 100%
        context.proceed();

        System.out.println("\nHoàn tất mô phỏng.");
    }
}