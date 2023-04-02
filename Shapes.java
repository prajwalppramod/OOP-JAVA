//Prajwal PP S3CS2 42
abstract class Shape
{	abstract void noofsides();
}
class Rectangle extends Shape
{	void noofsides()
{	System.out.println(" 4 sides ");}
}
class Triangle extends Shape
{   void noofsides()
{	System.out.println(" 3 sides ");}}
class Hexagon extends Shape
{	void noofsides()
{	System.out.println(" 6 sides ");}
}

public class Shapes
{	public static void main(String args[])
{	    Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        r.noofsides();
        t.noofsides();
        h.noofsides();
}
}

/*
OUTPUT

 4 sides 
 3 sides 
 6 sides 
 */
