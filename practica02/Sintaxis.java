import static java.lang.Math.sqrt;

public class Sintaxis {

	public static void main(String[] args) {
		int a, b, c;
		a = 3; b = 20; c = -7;

		boolean prop = true;
		byte ochoBits = 127;
		short dieciseisBits = -32768;

		double discriminante = b * b - 4 * a * c;
		double x1 = ((-b + sqrt(discriminante)) / (2 * a)); 
		double x2 = (-b - sqrt(discriminante)) / (2 * a);

		char ch1, ch2;
		ch1 = 'g'; ch2 = 'w';
		try{
			int d = 1 / (a - 3);
		}catch(ArithmeticException err){
			int d = 0;
		}

		// Declaraciones
			int var_1 =(int) 2147483648L;
			char quote = '\'';
	}
}