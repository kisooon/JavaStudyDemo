import java.util.Date;

import static java.lang.Thread.sleep;

public class Demo_1 {
    public static void main (String args []){
        System.out.println("hello_world");
        initEvents();


    }

    private static void initEvents() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date());
    }
}
