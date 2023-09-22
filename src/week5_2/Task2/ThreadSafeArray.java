package week5_2.Task2;

import java.util.ArrayList;

public class ThreadSafeArray extends Thread{

    private final ArrayList<String> list = new ArrayList<String>();

    public void add(String value) {
        synchronized(list){
            list.add(value);
        }
    }
    public void remove(String value) {
        synchronized (list) {
            list.remove(value);
        }
    }
    public void queryListSize() {
        synchronized (list) {
            System.out.println("Size: " + list.size());
        }
    }
    public void run(){
        add("Hello");
        add("World");
        add("Goodbye");
        add("World");
        remove("Goodbye");
        queryListSize();
    }
}
