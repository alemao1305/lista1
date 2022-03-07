package list1.exe3;

public class Teste3 {

	public static void main(String[] args) {
		Complexo z1 = new Complexo(5, 2);
		Complexo z2 = new Complexo(3, 4);
		Complexo z = new Complexo();
		
		System.out.println("1� N�mero:");
		z1.mostrar();
		System.out.println("2� N�mero: ");
		z2.mostrar();
		
		z = z1.soma(z2);	
		System.out.println("Soma: ");
		z.mostrar();
		
		z = z1.multiplica(z2);
		System.out.println("Multiplica��o: ");
		z.mostrar();
		
		System.out.println("Nota��o Complexa: " + z.toString());
		
		System.out.println("Modulo do 1� n�mero: ");
		System.out.printf("%.2f\n", z1.modulo());
		
		System.out.print("Modulo do 2� n�mero: ");
		System.out.printf("%.2f\n", z2.modulo());
		
		System.out.print("Argumento Principal do 1� n�mero: ");
		System.out.printf("%.2f\n", z1.argumentoPrincipal());
		
		System.out.print("Argumento Principal do 2� n�mero: ");
		System.out.printf("%.2f\n", z2.argumentoPrincipal());
	}
}
