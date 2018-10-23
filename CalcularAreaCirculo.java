import java.util.Scanner;
/**************************
 * clase que pide un radio*
 * valido al usuario y    *
 * calcula el area del    * 
 * circulo resultante     *
 * @author Miguel Rubio   *
 * @version 1.2           *
 **************************/ 

      
public class CalcularAreaCirculo{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		do {
			System.out.println("Indique un radio de circulo valido: ");
			radio = sc.nextDouble();
		}
		while(radio<=0); 
		System.out.println("El area del circulo de radio: " + radio + " es: " + Math.PI *(radio*radio));
		
		
	}
}
