// Area of a rectangle

import java.util.*;
public class AreaOfRectangle{
	public static void main(String[] args){
		float len , wid , area ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length and width respectively");
		len = in.nextFloat();
		wid = in.nextFloat();
		area = len*wid;
		System.out.println("The area is "+area);
	}
}