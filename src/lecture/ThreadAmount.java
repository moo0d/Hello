package lecture;

public class ThreadAmount {



    //How many threads my computer have?
    public static void main(String[] args) {
        System.out.println("Number of threads: " + Runtime.getRuntime().availableProcessors());
    }
}
