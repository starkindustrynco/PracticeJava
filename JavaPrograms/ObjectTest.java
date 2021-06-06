abstract class Shape{
	   abstract void draw();
	}


class Circle extends Shape{
	void draw(){
		System.out.println("circle");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("rectangle");
	}
}


public class ObjectTest{
	public static void main(String[] args){
		
		Shape [] s = {Circle , Square , Rectangle};
		for (int i = 0 ; i < s.length ; i++){
			s[i].draw();
		}
	}
}
