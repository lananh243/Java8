package business;

import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract interface IOrderBusiness {
    List<Order> orders = new ArrayList<>();
    public static void addOrder(Scanner scanner){
        System.out.println("Nhập vào số đơn hàng cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer();
            customer.inputData(scanner);
        }
    }

    public static void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void updateOrderStatus(Scanner scanner) {
        for (Order order : orders) {
            if (order.isStatus() == true) {
                System.out.println(!order.isStatus());
            }
        }
    }
}
