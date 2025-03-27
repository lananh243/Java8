package business;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    public static List<Customer> customers = new ArrayList<>();
    public static void addCustomer(Scanner scanner) {
        System.out.println("Nhập số lượng khách hàng cần thêm mới: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer();
            customer.inputData(scanner);
            customers.add(customer);
        }

    }

    public static void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

}
