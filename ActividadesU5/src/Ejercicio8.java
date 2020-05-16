import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
				System.out.println("Introduzca una fecha en formato DD/MM/YYYY o MM/DD/YYYY");
				String fecha = in.next();
				
				DateTimeFormatter conversor1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaD = LocalDate.parse(fecha, conversor1);
				
				System.out.println("ES "+ConversorES(fechaD));
				System.out.println("USA "+ConversorUSA(fechaD));
				
				System.out.println("Versión String "+ConversorStr(fecha));
			
	}
			
	
	
	public static String ConversorES(LocalDate fechaD) {
				String res = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(fechaD);
				return res;
			}
			
			public static String ConversorUSA(LocalDate fechaD) {
				String res = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(fechaD);
				return res;
			}
			
			public static String ConversorStr(String s) {
				return s.substring(3, 5)+"/"+s.substring(0,2)+"/"+s.substring(6);
			}

		
		
		
		
		
		
		
		
		
		
		
	}


