package Task27;

import java.util.ArrayList;

public class MainImg {
    public static void main(String[] args) {
        Image image = new Image();
        int k =Runtime.getRuntime().availableProcessors();
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0;i<k;i++) {
            Thread thread = new Thread(image);
            thread.setName(String.valueOf(i));
            threads.add(thread);
        }
        for (Thread thread : threads){
            thread.start();
        }
    }
}
