import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c =  'n';
		Scanner e = new Scanner(System.in);
		do {
			
			int o;
			double w,x,y,z;
			
			System.out.println("Enter points");
			System.out.print("w = ");
			Scanner s= new Scanner(System.in);
			w = s.nextDouble();
			
			System.out.print("x = ");
			Scanner s2= new Scanner(System.in);
			x = s.nextDouble();
			
			System.out.print("y = ");
			Scanner s3= new Scanner(System.in);
			y = s.nextDouble();
			
			System.out.print("z = ");
			Scanner s4= new Scanner(System.in);
			z = s.nextDouble();
			
			System.out.println("Select operation to perform: ");
			System.out.println("1- Length of the line drawn between the two points");
			System.out.println("2- Quadrant of the cartesian plane");
			System.out.println("3- Slope of the line they represent");
			System.out.println("4- Midpoint between the points");
			System.out.println("5- Find Interscetion Point");
			Scanner op= new Scanner(System.in);
			o = op.nextInt();
			
			switch(o)
			{
			case 1:
				System.out.println(distanceBetweenTwoPoints(w,x,y,z));
				break;
			
			case 2:
				findQuadrant(w,x,y,z);
				break;
				
			case 3:
				System.out.println(findSlope(w,x,y,z));
				break;
				
			case 4:
				findMidPoint(w,x,y,z);
				break;
				
			case 5:
				findIntersectionPoint(w,x,y,z);
				break;
				
				default:
					System.out.println("Invalid selection");
					break;
			}
			
			System.out.println("Want to go again Y or N?");
			c = e.next().charAt(0);
			
			if (c == 'N' || c == 'n')
			{
				System.out.println("Thank you. Have a nice day");
				System.exit(0);
			}
			
			else if(!(c == 'Y' || c == 'y'))
			{
				System.out.println("I said Y or N.");
				c = e.next().charAt(0);
			}
		}
		while(c == 'Y' || c == 'y');

	}
	
	public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2)
			{       
			    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
			}
	
	public static void findQuadrant(double x1, double y1, double x2, double y2)
	{
		//For first line points x1 and y1
		if (x1 > 0 && y1 > 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") First quadrant"); 
  
        else if (x1 < 0 && y1 > 0) 
            System.out.println("Points ("+ x1 + " , " + y1 + ") Second quadrant"); 
  
        else if (x1 < 0 && y1 < 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") Third quadrant"); 
  
        else if (x1 > 0 && y1 < 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") Fourth quadrant"); 
		
        else if (x1 == 0 && y1 > 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") lies at positive y axis"); 
  
        else if (x1 == 0 && y1 < 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") lies at negative y axis"); 
  
        else if (y1 == 0 && x1 < 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") lies at negative x axis"); 
  
        else if (y1 == 0 && x1 > 0) 
            System.out.println("Points ("+ x1 + " , " + y1 +") lies at positive x axis"); 
  
        else
            System.out.println("Points ("+ x1 + " , " + y1 +") lies at origin");
		
		//For first line points x2 and y2
		
		if (x2 > 0 && y2 > 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") First quadrant"); 
  
        else if (x2 < 0 && y2 > 0) 
            System.out.println("Points ("+ x2 + " , " + y2 + ") Second quadrant"); 
  
        else if (x2 < 0 && y2 < 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") Third quadrant"); 
  
        else if (x2 > 0 && y2 < 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") Fourth quadrant"); 
		
        else if (x2 == 0 && y2 > 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") lies at positive y axis"); 
  
        else if (x2 == 0 && y2 < 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") lies at negative y axis"); 
  
        else if (y2 == 0 && x2 < 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") lies at negative x axis"); 
  
        else if (y2 == 0 && x2 > 0) 
            System.out.println("Points ("+ x2 + " , " + y2 +") lies at positive x axis"); 
  
        else
            System.out.println("Points ("+ x2 + " , " + y2 +") lies at origin");
	}
	
	static double findSlope(double x1, double y1, double x2, double y2) 
	{ 
		return (y2 - y1) / (x2 - x1); 
	}
	
	static void findMidPoint(double x1, double y1, double x2, double y2) 
	{ 
		System.out.println ((x1 + x2) / 2 + " , " + (y1 + y2) / 2) ;  
	} 
	
	static void findIntersectionPoint(double x1, double y1, double x2, double y2) 
	{ 
		double x3,y3,x4,y4;
		
		System.out.println("Enter points");
		System.out.print("x3 = ");
		Scanner s= new Scanner(System.in);
		x3 = s.nextDouble();
		
		System.out.print("y3 = ");
		Scanner s2= new Scanner(System.in);
		y3 = s.nextDouble();
		
		System.out.print("x4 = ");
		Scanner s3= new Scanner(System.in);
		x4 = s.nextDouble();
		
		System.out.print("y4 = ");
		Scanner s4= new Scanner(System.in);
		y4 = s.nextDouble();
		
		double m1 = (y2-y1)/(x2-x1);
		double b1 = y1 - m1*x1; 
		double m2 = (y4-y3)/(x4-x3);
		double b2 = y3 - m2*x3;
		
		double x = (b2 - b1) / (m1 - m2);
	    double y = m1 * x + b1;
		
		System.out.println ("Points ("+ x + " , " + y +") are intersection points"  ) ;  
	} 

}
