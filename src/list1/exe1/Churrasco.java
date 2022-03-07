package list1.exe1;

public class Churrasco {
	public double qtdCarne;
		
		public void verificarConsumo(Pessoa p) {
			if (p.idade <= 3 || p.vegetariano == true) {
				this.qtdCarne = this.qtdCarne +0;
			}
			else if (p.idade >= 4 && p.idade <= 12) {
				this.qtdCarne++;
			}
			else if (p.idade > 13) {
				this.qtdCarne = this.qtdCarne +2;
			}
		}
		double getQtdcarne() {
			return this.qtdCarne;
		}
}
