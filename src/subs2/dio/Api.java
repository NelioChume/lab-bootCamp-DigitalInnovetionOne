package subs2.dio;

public class Api {
	
	private static Api instance = new Api();
	
	private Api() {
		super();
	}
	
	public static Api getInstance() {
		return instance;
	}
	
	public String recuperarCidade(String cep) {
		return "Maputo";
	}
	
	public String recuperarEstado(String cep) {
		return "MP";
	}
	
}
