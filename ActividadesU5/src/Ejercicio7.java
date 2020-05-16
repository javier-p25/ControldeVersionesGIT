
public class Ejercicio7 {

	public static class Conversor{
		
	int numero;     
   
    
	public Conversor(int numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		
	
		//pasar el numero a binario
		String binario = Integer.toBinaryString(this.numero);
		
		//pasar el numero a hexadecimal
		String hexa = Integer.toHexString(this.numero);
		
		//pasar numero a octal
		String octa = Integer.toOctalString(this.numero);
		//devolver todos las conversiones
		return "B = " + binario + "  H = " + hexa + "  O = " + octa;
	}
	
	
		
	}
	
	public static void main(String[] args) {
		
		Conversor c = new Conversor(1050);
		System.out.println(c.getNumero());
		
		
	}
	
}

//:)




