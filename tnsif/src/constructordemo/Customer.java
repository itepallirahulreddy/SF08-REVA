package constructordemo;

//demo for constructor 
public class Customer {
	
	private String customername;
	private int customerid;
	private String customeraddress;
	
	
	public Customer() {
	System.out.println("welcome");	
		
	}

	//parameter con
	public Customer(String customername, int customerid, String customeraddress) {

		this.customername = customername;
		this.customerid = customerid;
		this.customeraddress = customeraddress;
	}
	
	
	// getter and setter

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}


	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customerid=" + customerid + ", customeraddress="
				+ customeraddress + "]";
	}
	
	
	
	

}