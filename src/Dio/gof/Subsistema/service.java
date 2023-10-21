package Dio.gof.Subsistema;

public class service {
    private service () {
        super ();
    }
    public static void gravarCliente (String nome, String Cep, String cidade, String estado){

        System.out.println ("Cliente Salvo no Sistema: ");
        System.out.println (nome);
        System.out.println (Cep);
        System.out.println (cidade);
        System.out.println (estado);

    }
}
