import java.util.Scanner;
class MultTable{
	public synchronized void printMul(int num) {
		for(int i=1;i<=5;i++) {
			System.out.println(num+"*"+i+"="+i*num);
		}
	}
}

class Thr1 extends Thread {
	MultTable t1;
	int num1;
	Thr1(MultTable t) {
		this.t1=t;
	}
	public Thr1(MultTable t1,int num1) {
		this.t1=t1;
		this.num1=num1;
	}
	public void run() {
		t1.printMul(num1);
	}
}

class Thr2 extends Thread {
	MultTable t2;
	int num2;
	Thr2(MultTable t) {
		this.t2=t;
	}
	public Thr2(MultTable t2,int num2) {
		this.t2=t2;
		this.num2=num2;
	}
	public void run() {
		t2.printMul(num2);
	}
}

class Thr3 extends Thread {
	MultTable t3;
	int num3;
	Thr3(MultTable t) {
		this.t3=t;
	}
	public Thr3(MultTable t3,int num3) {
		this.t3=t3;
		this.num3=num3;
	}
	public void run() {
		t3.printMul(num3);
	}
}

public class MultiplicationTable {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the table you want to run by thread 1");
		int num1=sc.nextInt();
		System.out.println("enter the table you want to run by thread 2");
		int num2=sc.nextInt();
		System.out.println("enter the table you want to run by thread 3");
		int num3=sc.nextInt();
		MultTable mul=new MultTable();
		Thr1 t1= new Thr1(mul,num1);
		Thr2 t2= new Thr2(mul,num2);
		Thr3 t3= new Thr3(mul,num3);
		t1.start();
		try {
			t1.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}