import java.util.*;
public class Ejercicio6 {

	public class Empleado{
		private int sueldo;

		public Empleado() {
	        sueldo=0;
		}

		public void setSueldo(int s) {
			sueldo =s;
		}
		public int getSueldo() {
			return sueldo;
		}
	}
	//clase Encargado

	public class Encargado extends Empleado{

		public void main(String[] args) {

			Scanner teclado=new Scanner (System.in);

			Empleado emp=new Empleado();

			int sueldo=teclado.nextInt();
			emp.setSueldo(sueldo);
			int n=(emp.getSueldo()*10)/100;
			System.out.println("Total ="+sueldo+n);
		}
		
	}
	
}
	