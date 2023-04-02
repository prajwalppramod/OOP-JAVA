//Prajwal P P CS2S3
abstract class Shape{
	abstract void noofsides();
}
class Rectangle extends Shape{
	void noofsides(){
		System.out.println("Rectangle 4");
	}
}
class Triangle extends Shape{
	void noofsides(){
		System.out.println("Triangle 3");
	}
}
class Hexagon extends Shape{
	void noofsides(){
		System.out.println("Hexagon 6");
	}
}
public class Polymorphism{
	public static void main(String args[]){
	Rectangle r= new Rectangle();
	Triangle t= new Triangle();
	Hexagon h= new Hexagon();
	r.noofsides();
	t.noofsides();
	h.noofsides();
	}
}
/*
Rectangle 4
Triangle 3
Hexagon 6
*/
