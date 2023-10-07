package pratyush_CN;

class Hii implements Runnable{
	public void run()
	{	
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("HI") ; 
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}

class Helloo implements Runnable{
	public void run()
	{	
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("HELLO") ; 
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		Hii h = new Hii() ; 
		Helloo he = new Helloo() ; 
		Thread t1 = new Thread(h) ; 
		Thread t2 = new Thread(he) ;
		
		System.out.println(t1.getPriority()) ; 
		t1.start() ; 
		
		t2.setPriority(10);
		System.out.println(t2.getPriority()) ;
		try {
			Thread.sleep(10);
		}catch(Exception e) {}
		
		t2.start(); 
	}

}
