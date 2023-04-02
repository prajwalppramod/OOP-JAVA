import java.util.Random;
public class Randomnosqcube {
    public static void main(String[] args) {
        Thread1 td1 = new Thread1();
        td1.start();
        
    }
}

class Thread1 extends Thread
{
    public void run()
    {
        Random rand=new Random();
        
        for(int i=0; i<10; i++)
        {   int x=rand.nextInt(10);
            Thread2 td2= new Thread2(x);
            Thread3 td3= new Thread3(x);
            if(x%2==0)
            {
                td2.start();
            }
            else
            {
                td3.start();
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(""+e.toString());
            }
        }
        
    }
}

class Thread2 extends Thread
{   int y;
    Thread2(int num)
    {
        y=num;
    }
    public void run()
    {
        int z= y*y;
        System.out.println("Square is: "+z);
    }
}

class Thread3 extends Thread
{   int a;
    Thread3(int num)
    {
        a=num;
    }
    public void run()
    {
        int b=a*a*a;
        System.out.println("cube is: "+b);
    }
}