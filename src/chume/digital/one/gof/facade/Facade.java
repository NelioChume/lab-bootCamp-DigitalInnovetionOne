package chume.digital.one.gof.facade;

import subs1.dio.Service;
import subs2.dio.Api;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = Api.getInstance().recuperarCidade(cep);
		String estado = Api.getInstance().recuperarEstado(cep);
		
		Service.gravarCliente(nome, cep, cidade, estado);
	}
	
}
