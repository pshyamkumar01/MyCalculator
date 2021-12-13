import java.util.Scanner;

public class calculator {

	public static void main(String[] args)
	{
		short s = 2;
		Scanner num=new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("-----------------------");
		System.out.println("WELCOME TO MY CALCULATOR");
		System.out.println("------------------------");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("MY CALCULATOR DOES 4 CALCULATIONS");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		while(s==2)
		{
		
		System.out.println("CHOICES");
		System.out.println("-------");
		System.out.println(" ");
		System.out.println("1. ADDITION");
		System.out.println("2. SUBTRACTION");
		System.out.println("3. MULTIPLICATION");
		System.out.println("4. DIVISION");
		System.out.println("5. LOGOUT");
		System.out.println(" ");
		System.out.println("ENTER YOUR CHOICE OF (1/2/3/4/5)");
		System.out.println(" ");
		
		short input=num.nextShort();
		System.out.println(" ");
		
		switch (input)
		{
		case 1:
			try
			{
			
			System.out.println("FOR THIS YOU NEED TO INPUT TWO VALUES");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("ENTER YOUR FIRST INTEGER VALUE");
			System.out.println(" ");
			
			short first_val=num.nextShort();
			System.out.println(" ");
			
			System.out.println("ENTER YOUR SECOND INTEGER VALUE");
			System.out.println(" ");
		
			short second_val=num.nextShort();
			System.out.println(" ");
			
			int add=first_val+second_val;
			System.out.println("THE ADDITION OF "+first_val+" + "+second_val+" = "+add);
			System.out.println(" ");
			System.out.println(" ");
			}catch(Exception e)
			{
				System.out.println("please enter correct input");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
			break;
			
		case 2:
			
			System.out.println("FOR THIS YOU NEED TO INPUT TWO VALUES");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("ENTER YOUR FIRST INTEGER VALUE");
			System.out.println(" ");
			
			short first_vall=num.nextShort();
			System.out.println(" ");
			
			System.out.println("ENTER YOUR SECOND INTEGER VALUE");
			System.out.println(" ");
		
			short second_vall=num.nextShort();
			System.out.println(" ");
			
			int sub=first_vall-second_vall;
			System.out.println("THE SUBTRACTION OF "+first_vall+" - "+second_vall+" = "+sub);
			System.out.println(" ");
			System.out.println(" ");
			break;
			
		case 3:
			System.out.println("FOR THIS YOU NEED TO INPUT TWO VALUES");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("ENTER YOUR FIRST INTEGER VALUE");
			System.out.println(" ");
			
			short first_valll=num.nextShort();
			System.out.println(" ");
			
			System.out.println("ENTER YOUR SECOND INTEGER VALUE");
			System.out.println(" ");
		
			short second_valll=num.nextShort();
			System.out.println(" ");
			
			int mul=first_valll*second_valll;
			System.out.println("THE MULTIPLICATION OF "+first_valll+" * "+second_valll+" = "+mul);
			System.out.println(" ");
			System.out.println(" ");
			break;
			
		case 4:
			try
			{
				System.out.println("FOR THIS YOU NEED TO INPUT TWO VALUES");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("ENTER YOUR FIRST INTEGER VALUE");
				System.out.println(" ");
				
				float first_valu=num.nextFloat();
				System.out.println(" ");
				
				System.out.println("ENTER YOUR SECOND INTEGER VALUE");
				System.out.println(" ");
			
				float second_valu=num.nextFloat();
				System.out.println(" ");
				
			double div=first_valu/second_valu;
			System.out.println("THE DIVISION OF "+first_valu+" / "+second_valu+" = "+div);
			System.out.println(" ");
			System.out.println(" ");
			}catch(Exception e)
			{
				System.out.println("please enter correct input");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
			break;
			
		case 5:
		{
			System.out.println("YOU CHOOSED TO LOGOUT");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("THANK YOU :))");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("BYE :)");
			s = 4;
			break;
		}
		
		default:
			System.out.println("YOU HAVE ENTERED OUT OF OPTIONS");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("PLEASE TRY AGAIN !!");
			System.out.println(" ");
			System.out.println(" ");
			break;
					
		}
		
		
						
		}

	}

}
