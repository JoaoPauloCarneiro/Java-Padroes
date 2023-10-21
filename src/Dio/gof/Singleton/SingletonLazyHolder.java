package Dio.gof.Singleton;

//** Encapsular a Instancia em um classe estatica Interna
public class SingletonLazyHolder {
       private static class Holder {
           public static SingletonLazyHolder instancia = new SingletonLazyHolder();
       }
       private SingletonLazyHolder () {
           super ();
       }
       public static SingletonLazyHolder getInstancia () {
           return Holder.instancia;
       }
}
