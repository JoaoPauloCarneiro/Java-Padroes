package Dio.gof.Singleton;


//** Instanciar Direto.
public class SingletonEager  {
    private static SingletonEager instancia = new SingletonEager ();
    private SingletonEager () {
        super ();
    }
    public static SingletonEager gentInstancia () {
        return instancia;
    }
}
