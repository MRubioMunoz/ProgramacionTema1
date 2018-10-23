import java.util.Scanner; 

public class CalculadoraSinSwitch {
		
	public static void main (String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println ("Introduzca el primer numero: ");
			int a = 4;//sc.nextInt();
		System.out.println ("Introduzca el segundo numero: ");
			int b = 5; //sc.nextInt();
		
		System.out.println ("La suma es: " + (a+b));
		System.out.println ("La resta es: " + (a-b));
		System.out.println ("La multiplicacion es: " +(a*b));
		System.out.println ("La division es: " + (a/b));
		System.out.println ("El cuadrado del primer  es: " + (a*a));
		System.out.println ("El cuadrado del segundo  es: " + (b*b));
	}
}
