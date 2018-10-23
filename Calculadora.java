import java.util.Scanner; 

public class Calculadora {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduzca el primer numero: ");
			double a = sc.nextDouble();
		System.out.println ("Introduzca el segundo numero: ");
			double b = sc.nextDouble();
			
			boolean salir = false;
			
	while(!salir){
			
		System.out.println ("Pulse 1 para sumar");
		System.out.println ("Pulse 2 para restar");
		System.out.println ("Pulse 3 para multiplicar");
		System.out.println ("Pulse 4 para dividir");
		System.out.println ("Pulse 5 para elevar al cuadrado el primer numero");
		System.out.println ("Pulse 6 para elevar al cuadrado el segundo numero");
		System.out.println ("Pulse 7 para salir");
			
		int opcion = sc.nextInt();
			
	switch(opcion){
               case 1:
                   System.out.println ("La suma es: " + (a+b));;
                   break;
               case 2:
					System.out.println ("La resta es: " + (a-b));
                   break;
                case 3:
                  System.out.println ("La multiplicacion es: " +(a*b));
                   break;
                case 4:
                   System.out.println ("La division es: " + (a/b) + " cuyo resto es: " + (a%b));
                   break;
                case 5:
                   System.out.println ("el cuadrado del primer numero es: " + a*a);
                   break;
                case 6:
                   System.out.println ("el cuadrado del segundo numero es: " + b*b);
                   break;
                case 7:
					salir = true;
					break;
           }
            
       }
	}
}

