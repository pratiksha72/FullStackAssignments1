package bean;
public class Account 
 {
	private int accnum;
	private String name;
	private float amount;

	
		
	public Account(int accnum, String name, float amount) {
		//super();
		this.accnum = accnum;
		this.name = name;
		this.amount = amount;
	}
	public int getAccnum() {
		return accnum;
	}
	
	public void setAcc_no(int accnum) {
		this.accnum = accnum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}
