//Prajwal P P CS2S3
public class Garbage
{	public static void main(String args[])
	{	Test ob1=new Test(14,12.3f);
		ob1=null;
		System.gc();
		Test ob2=new Test(20,25.3f);
		Test ob3=new Test(5,18.6f);
		ob2=ob3;
		System.gc();
	}
}

class Test
{	int a;
	float b;	
	Test(int i, float j)
	{	a=i;
		b=j;
	}
	public void finalize()
	{	System.out.println("Garbage collector called");
		System.out.println("Object garbage collected");
	}
}


/*
Garbage collector called
Object garbage collected
*/
