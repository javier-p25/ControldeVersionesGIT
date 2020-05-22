import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un objeto de la clase scanner para pedir un numero por teclado
		Scanner scan = new Scanner(System.in);
		
		//declaro una variable de tipo double
		double numero;
		
		//introducir un numero decimal con , 
		System.out.print("Introduzca un número decimal: ");
		
        //el numero introducido por teclado se guardara en nuestra variable numero 

		numero= scan.nextInt();
		
		//en versiones anteriores lo usaria asi, en esta version esta forma esta deprecated
		//Double d = new Double(numero);
		
		//creo un wrapper de tipo double y le paso mi variable numero
		Double d =  Double.valueOf(numero);
		
		//muestro por pantalla mi wrapper
		System.out.println(d);
		
		//otro cambio mas
		System.out.println("cambio para el commit");
		
		

	}

}
