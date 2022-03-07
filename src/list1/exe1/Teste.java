package list1.exe1;

public class Teste {

	public static void main(String[] args) {
		Pessoa x1 = new Pessoa("Bruna", Sexo.Feminino ,22 ,true);
		Pessoa x2 = new Pessoa("Roberto", Sexo.Masculino ,2 ,false);
		Pessoa x3 = new Pessoa("Carol", Sexo.Feminino ,10 ,false);
		
		Churrasco FimDeSemana = new Churrasco();
		
		FimDeSemana.verificarConsumo(x1);
		FimDeSemana.verificarConsumo(x2);
		FimDeSemana.verificarConsumo(x3);
		
		System.out.println(FimDeSemana.getQtdcarne());
	}
 
}
