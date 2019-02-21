import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Customer customer = new Customer(waiter);
        System.out.println("Menu: pizza  ----  steak ");
        System.out.print("Moi chon mon: ");
        Scanner input = new Scanner(System.in);
        customer.request(input.nextLine());
    }

}