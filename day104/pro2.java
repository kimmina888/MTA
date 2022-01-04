package day104;
class Account{
	double balance;
	public Account(double startingBalance){
		balance = startingBalance;
	}
	public double getBalance() {
		return balance;
	}
}
public class pro2 extends Account{
	double rate = 0.02;
	public pro2(double startingBalance){
		super(startingBalance);
	}
	@Override
	public String toString(){
		return String.format("Savings Current Balance : $%.2f", this.getBalance());
	}
    static void main(String[] args) {
		pro2 p = new pro2(20);
		
	}
}

