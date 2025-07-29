/**
 * @author huayangchen
 * @description
 * @create 2025-07-29
 */
public class Business {

    public static void main(String[] args) {
        double i = 0.0;

        while (i != 10.0) {
            i += 0.1;
            System.out.printf("Current value: %.20f\n", i);
        }

        System.out.println("Loop ended!");
    }
}