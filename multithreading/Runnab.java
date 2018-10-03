package multithreading;

 class MyT implements Runnable{

	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+" ");
		}
		
	}
	
}
public class Runnab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyT t=new MyT();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=100;i>=1;i--)
		{
			System.out.println(i+" ");
		}
		
	}

}
