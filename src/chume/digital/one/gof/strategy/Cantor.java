package chume.digital.one.gof.strategy;

public class Cantor {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void cantar() {
		comportamento.cantar();
	}
	
	public void compor() {
		comportamento.compor();
	}
	
	public void dancar() {
		comportamento.dancar();
	}
	
}
