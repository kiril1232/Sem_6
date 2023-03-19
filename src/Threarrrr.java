/**
 * * Created by user on 19.03.2023
 */
public class Threarrrr {
    public static void main(String[] args) {
        Runnable a = (Runnable) new Threarrrr();
        Thread b = new Thread(a);
        b.start();
        // d.start
    }
}
