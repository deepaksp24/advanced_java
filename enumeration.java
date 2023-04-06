import java.util.*;

enum currency{
	
	euro(20),dollar(40),pound(90);
	int price;
	
	currency(int i) {	//Contractor for price
		this.price=i;
	}
	
	int getvalue()	//return  value for price
	{
		return price;
	}

	static int convert(currency choice,int amt) {	//get values from getvalue() and calculate the conversion
		int fcun=choice.getvalue()*amt;
		return fcun;
	}
	
}
public class enumeration{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	/*currency in=currency.dollar;
	System.out.println(in.getvalue()); */
		try{
		System.out.println("enter the currency");
		String in=sc.nextLine();
		currency choice =currency.valueOf(in);
		System.out.println("enter the amount");
		int n=sc.nextInt();
		sc.close();
		//currency c=currency.valueOf(choice);
		
			if(choice != null)
			System.out.println("got u baby");
			
			System.out.println(currency.convert(choice,n));
			
		}
		catch (Exception e)
		{
			System.out.println("wrong broooooooo"+e);
		}
		
	}	
}
