import java.util.Date;

public class main {
	 public static void main(String[] args) {
	        Customer customer1 = new Customer("Nguyễn Văn A");
	        Customer customer2 = new Customer("Trần Thị B", true, "Gold");

	        Visit visit1 = new Visit(customer1, new Date(), 100000, 50000);
	        Visit visit2 = new Visit(customer2, new Date(), 200000, 100000);

	        System.out.println("Thông tin khách hàng 1:");
	        System.out.println(customer1);
	        System.out.println("Thông tin chi tiết lần ghé thăm:");
	        System.out.println(visit1);
	        System.out.println("Tổng chi phí: " + visit1.getTotalExpense());

	        System.out.println("\nThông tin khách hàng 2:");
	        System.out.println(customer2);
	        System.out.println("Thông tin chi tiết lần ghé thăm:");
	        System.out.println(visit2);
	        System.out.println("Tổng chi phí: " + visit2.getTotalExpense());
	    }

}
