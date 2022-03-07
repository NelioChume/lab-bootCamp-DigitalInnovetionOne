import chume.digital.one.gof.facade.Facade;
import chume.digital.one.gof.singleton.SingletonLazyHolder;
import chume.digital.one.gof.strategy.Cantando;
import chume.digital.one.gof.strategy.Cantor;
import chume.digital.one.gof.strategy.Compondo;
import chume.digital.one.gof.strategy.Comportamento;
import chume.digital.one.gof.strategy.Dancando;

public class App {

	public static void main(String[] args) {
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		Comportamento cantar = new Cantando();
		Comportamento dancar = new Dancando();
		Comportamento compor = new Compondo();
		
		Cantor cantor = new Cantor();
		
		cantor.setComportamento(cantar);
		cantor.cantar();
		
		cantor.setComportamento(dancar);
		cantor.dancar();
		
		cantor.setComportamento(compor);
		cantor.compor();

		Facade facade = new Facade();
		facade.migrarCliente("Nelio Chume", "14801788");
		
	}

}
