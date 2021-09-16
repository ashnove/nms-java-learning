
public class Supplier extends Person{
	
	private String mobile;
	
	public void setnumber(String number) {
		mobile = number;
	}
	public void getnumber() {
		System.out.println("Supplier's mobile number is: " + mobile);
	}
	@Override
	public void showName() {
		System.out.println("Supplier's name is: " + name);
	}
}
