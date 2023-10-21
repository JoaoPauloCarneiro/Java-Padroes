package Dio.gof;

import Dio.gof.Facade.Facade;
import Dio.gof.Singleton.SingletonEager;
import Dio.gof.Singleton.SingletonLazy;
import Dio.gof.Singleton.SingletonLazyHolder;
import Dio.gof.Strategy.*;

public class Teste {
    public static  void main (String [] args ) {
        SingletonLazy lazy = SingletonLazy.getInstancia ();
        System.out.println (lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.gentInstancia ();
        System.out.println (Eager);
        Eager = SingletonEager.gentInstancia();
        System.out.println(Eager);

        SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia ();
        System.out.println (Holder);
        Holder = SingletonLazyHolder.getInstancia();
        System.out.println(Holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefesa();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover ();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover ();
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        //FACADE

        Facade facade = new Facade ();
        facade.migrarCliente("João Paulo","232323400");



    }
}
