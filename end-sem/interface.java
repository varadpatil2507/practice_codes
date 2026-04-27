import java.util.*;
interface Payment {
	void pay();
}

class GooglePay implements Payment{
	public void pay(){
		System.out.println("paymet done using GooglePay !");
	}
}

class PhonePe implements Payment{
	public void pay(){
		System.out.println("paymet done using PhonePe !");
	}
}

class Paytem implements Payment{
	public void pay(){
		System.out.println("paymet done using Paytem !");
	}
}

class UPI {
	public static void main(String[] args){
		UPI upi=new UPI();
		Scanner sc=new Scanner(System.in);
		System.out.print("1.GooglePay\n"+"2.PhonePe\n"+"3.Paytem\n");
		System.out.print("Enter payment method: ");
		int n=sc.nextInt();
		
		switch(n){
			case 1:
				GooglePay gp=new GooglePay();
				gp.pay();
				break;

			case 2:
				PhonePe pp=new PhonePe();
				pp.pay();
				break;

			case 3:
				Paytem p=new Paytem();
				p.pay();
				break;	
			
			default:
				System.out.println("Invalid input !");
		}
		
	}
}