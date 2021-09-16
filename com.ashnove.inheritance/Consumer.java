
public class Consumer extends Person{
	
	private String mobile;
	
	public void setnumber(String number) {
		mobile = number;
	}
	public void getnumber() {
		System.out.println("Consumer's mobile number is: " + mobile);
	}
	
	@Override
	public void showName() {
		System.out.println("Consumer's name is: " + name);
	}
}
