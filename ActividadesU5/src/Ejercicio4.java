import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//pedimos que se introduzca la primera cifra 
		System.out.println("Introduzca la primera cifra: ");
		 int numero1 = sc.nextInt();
		 //pedimos que se introduzca la 2 cifra 
		 System.out.println("Introduce la segunda cifra: ");
		 int numero2 = sc.nextInt();
		//Hacemos la operacion, en esta caso de suma
		 System.out.println("La suma de los dos numeros es: ");
		 int resultado1 = numero1+numero2;
		 //metemos la operacion en la variable resultado1 para poder trabajar con el  
		 System.out.println(resultado1);
		 
		 
		 //paso el resultado a binario
		 
		  String binario = Integer.toBinaryString(resultado1);
			 System.out.println("Resultado de la suma en binario");
		    System.out.println(binario); // 1000
		 
		 
		 //paso el resultado a hexadecimal
		 
		    String hexa = Integer.toHexString(resultado1);
			 System.out.println("Resultado de la suma en Hexadecimal");
		    System.out.println(hexa); // 1000
		 
		 
		 //paso el resultado a octal
		 
		  String octal = Integer.toOctalString(resultado1);
			 System.out.println("Resultado de la suma en octal");
		    System.out.println(octal); // 1000
	

	}
		
		 }
	
	

		 
	


