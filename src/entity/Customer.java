package entity;

import java.util.Optional;
import java.util.Scanner;

public class Customer implements IApp{
    private static int autoincreasement = 0;
    private int id;
    private String name;
    private Optional<String> email;

    public Customer() {
    }

    public Customer(int id, String name, Optional<String> email) {
        this.id = ++autoincreasement;
        this.name = name;
        this.email = Optional.ofNullable(String.valueOf(email));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên khách hàng: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập vào email khách hàng: ");
        this.email = Optional.of(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email.orElse("Ko có email") +
                '}';
    }
}
