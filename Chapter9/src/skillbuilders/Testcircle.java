package skillbuilders;

import java.text.DecimalFormat;

public class Testcircle {

	public static void main(String[] args) 
	{
		//create an circle object using default constructor
		DecimalFormat dc = new DecimalFormat("0.00");
		Circle c1 = new Circle();
		System.out.println(c1.getradius());
		c1.setRadius(12.9);
		System.out.println(c1.getradius());
		System.out.println(dc.format(c1.calculateArea()));
		
		
	}

}
