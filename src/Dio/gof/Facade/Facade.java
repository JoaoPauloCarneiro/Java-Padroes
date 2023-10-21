package Dio.gof.Facade;

import Dio.gof.Subsistema.service;
import Dio.gof.subsistema2.CepApi;

/**Interface simples para consumo das informações  */
public class Facade {
    public void migrarCliente (String nome, String Cep){
        String cidade = CepApi.gentInstancia().recuperarCidade(Cep);
        String estado = CepApi.gentInstancia().recuperarEstado(Cep);

        service.gravarCliente (nome, Cep, cidade, estado);

    }

}
