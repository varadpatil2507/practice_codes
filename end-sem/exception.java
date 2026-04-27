import java.util.*;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message){
		super(message);
	}
}

class Exp{
		
	static void checkAge(int age) throws InvalidAgeException {
		if(age<18){
			throw new InvalidAgeException("caught Exception :: Entered age is not eligible for voting!!..");
		}
		else{
			System.out.println("Eligible for voting!!");
		}		
	
	}

	
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			checkAge(age);
		}
		
	}
}