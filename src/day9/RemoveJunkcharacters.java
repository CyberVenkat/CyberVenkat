package day9;

public class RemoveJunkcharacters {

	public static void main(String[] args) {
		
		String s ="!@#$%^&*()_+asdfg java selenium";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
