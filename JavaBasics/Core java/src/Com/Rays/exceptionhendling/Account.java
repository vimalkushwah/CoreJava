package com.rays.exceptionhendling;

public class Account {
	private String accountNo=null;
	private String accountType=null;
	private int bal=0; 
	public Account() {}
	public Account(String acc,String at,int bal) {
		accountNo=acc;
		accountType=at;
		this.bal=bal;
	}
		public String getAccountNo() {
			return accountNo;
		}
		public String getAccountType() {
			return accountType;
		}
		public int getBal() {
			return bal;
		}
		public void withdraw(int d) {
			int i=getBal();
			if(i-500<d) {
				InsufficiantFund e=new InsufficiantFund();
				try {
					throw e;
			}catch(InsufficiantFund e1) {
				System.out.println(e.getMessage());
			}
			}
			else i-=d;
			this.bal=i;
			System.out.println(i);
		}
	
}
