import java.util.Random;
class Oddevensquarecube
{	public static void main(String [] args)
	{	Thread1 t1=new Thread1();
		t1.start();
	}
}

class Thread1 extends Thread
{	public void run()
	{	Random rand = new Random();
		for(int i=0; i<10; i++)
		{	int x = rand.nextInt(10);
			Thread2 t2 = new Thread2(x);
			Thread3 t3 = new Thread3(x);
			if(x%2==0)
			{	t2.start();
			}
			else
			{	t3.start();
			}
			try
			{	Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{	System.out.println(""+e.toString());
			}
		}
	}
}

class Thread2 extends Thread
{	int y;
	Thread2(int num)
	{	y=num;
	}
	public void run()
	{	int z=y*y;
		System.out.println("Square is: "+z);
	}
}

class Thread3 extends Thread
{	int a;
	Thread3(int num)
	{	a=num;
	}
	public void run()
	{	int b=a*a*a;
		System.out.println("Cube is: "+b);
	}
}
/*OUTPUT
Cube is: 125
Cube is: 343
Square is: 16
Square is: 64
Square is: 36
Square is: 4
Cube is: 125
Cube is: 729
Square is: 0
Square is: 4
*/
