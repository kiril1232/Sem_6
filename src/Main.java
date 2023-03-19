import Threar.Threar;

/**
 * Created by user on 19.03.2023
 */
public class Main {
    public static void main(String[] args) {
        Runnable a= (Runnable) new  Threarrrr();
        Thread b= new Thread(a);
        Runnable c= new Threar();
        Thread d= new Thread(c);
        b.start();
        // d.start();

    }
}
