package Dio.gof.Strategy;

public class ComportamentoDefesa implements Comportamento {
    @Override
    public void mover () {
        System.out.println("Movendo Defensivamente");
    }


}
