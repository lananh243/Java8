package entity;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class Order implements IApp{
    private int autoincreasement = 0;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private boolean status=false;

    public Order(int id, Customer customer, LocalDate orderDate, double totalAmount, boolean status) {
        this.id = ++autoincreasement;
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào tên khách hàng: ");
        this.customer.setName(scanner.next());
        System.out.println("Nhập vào email khách hàng: ");
        this.customer.setEmail(Optional.of(scanner.nextLine()));
        System.out.println("Nhập vào ngày đặt hàng: ");
        this.orderDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập vào tổng tiền đơn hàng: ");
        this.totalAmount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vào trạng thái đơn hàng: ");
        this.status = scanner.nextBoolean();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }
}
