import java.util.Scanner;

public class AreaOfTriangle {
	private static Scanner sc;

	public static void main(String[] args) {
		double a, b, c, Perimeter, s, Area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter Three sides of triangle: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		Perimeter = a + b + c;
		s = (a + b + c)/2; // Perimeter/2
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


		System.out.println("\n The Perimeter of Traiangle ="+ Perimeter);
		System.out.println("\n The Semi Perimeter of Traiangle ="+ s);
		System.out.println("\n The Area of triangle ="+ Area);
	}
}