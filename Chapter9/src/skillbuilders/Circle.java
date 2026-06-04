package skillbuilders;

public class Circle 
{
	private double radius;
	public Circle()// default constructor
	{
		radius = 1.0;
	}

	public Circle(double r)//overload
	{
		radius = r;
	}

	public double getradius()// accessor
	{
		return radius;
	}
	public void setRadius(double r)// modifier

	{
		if(r > 0)
		radius = r;
		
		else
			System.out.println("error radius must be positive");
	}

	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2); 
	}

	public String toString()
	{
		return "Circle[Radius= "+ radius + ", area="+ calculateArea()+ "]";
	}


















}
