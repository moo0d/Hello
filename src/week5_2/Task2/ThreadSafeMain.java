package week5_2.Task2;


public class ThreadSafeMain {

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            ThreadSafeArray tsa = new ThreadSafeArray();
            tsa.start();
        }
    }
}
