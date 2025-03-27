package presentation;

import business.CustomerBusiness;
import business.IOrderBusiness;

import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********************SHOP MENU*******************");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn từ 1 - 3: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean isFlag = true;
                    do {
                        System.out.println("***********************CUSTOMER MENU******************");
                        System.out.println("1. Danh sách khách hàng");
                        System.out.println("2. Thêm mới khách hàng");
                        System.out.println("3. Thoát");
                        System.out.println("Lựa chọn từ 1 - 3: ");
                        choiceCus = scanner.nextInt();
                        switch (choiceCus) {
                            case 1:
                                CustomerBusiness.displayCustomers();
                                break;
                            case 2:
                                CustomerBusiness.addCustomer(scanner);
                                break;
                            case 3:
                               isFlag = false;
                            default:
                                System.err.println("Vui lòng chọn từ 1 - 3");
                        }
                    } while (isFlag = false);
                case 2:
                    do {
                        System.out.println("*********************CUSTOMER MENU*******************");
                        System.out.println("1. Danh sách đơn hàng");
                        System.out.println("2. Thêm mới đơn hàng");
                        System.out.println("3. Cập nhật trạng thái đơn hàng");
                        System.out.println("4. Danh sách đơn hàng quá hạn");
                        System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)");
                        System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao");
                        System.out.println("7. Thoát");
                        int choiceOrd = scanner.nextInt();
                        scanner.nextLine();
                        switch (choiceOrd) {
                            case 1:
                                IOrderBusiness.displayOrders();
                                break;
                            case 2:
                                IOrderBusiness.addOrder(scanner);
                                break;
                            case 3:
                                IOrderBusiness.updateOrderStatus(scanner);
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            default:
                                System.err.println("Vui lòng lựa chọn từ 1 - 7");
                        }
                    }while (choice != 3);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 - 3");
            }
        }while (true);

    }
}
