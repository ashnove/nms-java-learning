
public class Transporter extends Person{
	
	private String mobile;
	
	public void setnumber(String number) {
		mobile = number;
	}
	public void getnumber() {
		System.out.println("Transporter's mobile number is: " + mobile);
	}
	
	@Override
	public void showName() {
		System.out.println("Transporter's name is: " + name);
	}
	
	public void travelCharges() {
		System.out.println("Oil: Rs. 100");
		System.out.println("Highway toll: Rs. 100");
		System.out.println("Snacks: Rs. 50");
	}
}
