import java.util.Scanner;
public class CirculoObjeto{
	
	CirculoObjeto(double radio){
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		radio;
		do {
			System.out.println("Indique un radio de circulo valido: ");
			radio = sc.nextDouble();
		}
		while(radio<=0); 
		System.out.println("El area del circulo de radio: " + radio + " es: " + Math.PI *(radio*radio));
		
		
	}
}
