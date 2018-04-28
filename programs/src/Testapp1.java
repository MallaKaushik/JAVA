class Testapp2 extends Thread
{
	Thread t;
Testapp2()
{
	super("Demo Thread");
	System.out.println("Child thread: " + this);
	start(); // Start the thread
}
public void run()
{
 try
{
for(int i = 5; i> 0; i--)
{
System.out.println("Child Thread: " + i);
Thread.sleep(10);
}
} catch (InterruptedException e) {
	System.out.println("Child interrupted.");
	}
	System.out.println("Exiting child thread.");
}
}
class Testapp1{
	public static void main(String args[ ])
	{
	Testapp2 t=new Testapp2(); // create a new thread
	try
	{
	for(int i = 5; i> 0; i--) {
	System.out.println("Main Thread: " + i);
	t.run();
	Thread.sleep(00);
	
	}
	} catch (InterruptedException e) {
	System.out.println("Main thread interrupted.");
	}
	System.out.println("Main thread exiting.");
	}

}