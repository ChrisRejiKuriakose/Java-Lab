import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter an Integer String:");
    	String num = sc.nextLine();
    	StringTokenizer obj = new StringTokenizer(num);
    	System.out.println("No of tokens"+obj.countTokens());
    	int sum=0;
    	System.out.println("numbers:");
    	while(obj.hasMoreElements()) {
    		int number = Integer.parseInt(obj.nextToken());
    		System.out.println(number);
    		sum=sum+number;
    	}
    	System.out.println("sum is "+ sum);
    }
		
	}
	


