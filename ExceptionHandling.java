import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char choice='y';
		while(choice=='y') {
			System.out.println("enter no. 1");
			int number1=sc.nextInt();
			System.out.println("enter no. 2");
			int number2=sc.nextInt();
			try {
				int result=number1/number2;
				System.out.println("Result=" +result);
			}
			catch(Exception e) {
				System.out.println("div by zero");
			}
			finally {
				System.out.println("operation end");
				System.out.println("do you want to continue?");
				choice=sc.next().charAt(0);
			}
			
		}
	}

}
