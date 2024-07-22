package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();

		acc.setAccno(101);
		acc.setAmount(12000);
		acc.setAccname("Venkat");
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getAccname());
	}

}
