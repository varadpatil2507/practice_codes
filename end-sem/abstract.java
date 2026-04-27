abstract class Shape{
	double area;
	abstract void area();
	public void display(double area){
		System.out.println("area: "+area);
	}
}
class Circle extends Shape{
	double area;
	int radius=3;
	void area(){
		area=3.14*radius*radius;
		display(area);
	}
}
class Rectangle extends Shape{
	double area;
	int length=4;
	int breadth=3;
	void area(){
		area=length*breadth;
		display(area);
	}
}
class Triangle extends Shape{
	double area;
	int height=5;
	int base=2;
	void area(){
		area=0.5*height*base;
		display(area);
	}
}

class Main{
	public static void main(String[] args){
		Circle c=new Circle();
		c.area();
		Rectangle t=new Rectangle();
		t.area();
		Triangle tr =new Triangle();
		tr.area();
	}
}