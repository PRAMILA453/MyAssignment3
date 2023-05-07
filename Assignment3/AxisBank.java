package week3.Assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("15000 Rupees");
	}
public static void main(String[] args) {
	AxisBank Bank =new AxisBank();
	Bank.saving();
	Bank.fixed();
	Bank.deposit();
}
}
