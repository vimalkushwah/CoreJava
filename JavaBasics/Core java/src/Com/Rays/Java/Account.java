package Com.Rays.Java;

public class Account {
	private String no = null;
	private String Account = null;
	private Double bal = 0.00;
	
	public String getno () {
		return no;
	}
	public String getAccount() {
		return Account;
	}
	public Double getbal() {
		return bal;
	}
	public void setno(String no) {
		this.no = no;
	}
	public void setAccount(String Account) {
		this.Account=Account;
	}
	public void setbal(Double bal) {
		this.bal=bal;
	}

}
