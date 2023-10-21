package Dio.gof.subsistema2;
public class CepApi {
    private static CepApi instancia = new CepApi ();
    private CepApi () {

        super ();
    }
    public static CepApi gentInstancia () {
        return instancia;
    }
    public String recuperarCidade (String cep) {
        return "Rio de Janeiro";

    }
    public String recuperarEstado (String cep) {
        return "Rio de Janeiro";

    }
}
