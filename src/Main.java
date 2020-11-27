import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("===Program Kasir Rock n Roll Haircut");
        System.out.println("Customer Name : ");
        customer.setName(scan.nextLine());
        System.out.println("Customer Email :");
        customer.setEmail(scan.nextLine());
        customer.displayService();
        customer.setPriceService(customer.getPrice(scan.nextInt()));
        System.out.print("Are you a member? ");
        customer.setMember(customer.checkMemberStatus(scan.next()));


        System.out.println("\n #****************************************#");
        System.out.println("\n #************Customer Invoice************#");
        System.out.println("Date Transaction : ");
        System.out.println("Service Price    : "+customer.getPriceService());
        System.out.println("Discount         : "+ customer.getSale(customer.isMember(), customer.getPriceService()));
        System.out.println("Total Pay        : "+ customer.getTotalPay(customer.getPriceService(),
                customer.getSale(customer.isMember(), customer.getPriceService())));




    }
}
