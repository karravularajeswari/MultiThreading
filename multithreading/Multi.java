package multithreading;
import java.util.*;
class MyThread extends Thread{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" "+"*"+" "+i+"="+""+(n*i));
		}
	}
	
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();

	}
	

}
