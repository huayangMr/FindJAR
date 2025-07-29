import java.util.ArrayList;
import java.util.List;

/**
 * @author huayangchen
 * @description
 * @create 2025-07-29
 */
public class MyCode {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int counter = 0;

        while (true) {
            // 每次生成一个 1MB 左右的大字符串并强引用保存
            String data = new String(new byte[1024 * 1024]); // 1MB
            list.add(data);

            counter++;
            if (counter % 100 == 0) {
                System.out.println("Allocated: " + counter + "MB");
            }
        }
    }
}