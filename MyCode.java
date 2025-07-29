
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huayangchen
 * @description
 * @create 2025-07-29
 */
public class MyCode {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        int counter = 0;
//
//        while (true) {
//            // 每次生成一个 1MB 左右的大字符串并强引用保存
//            String data = new String(new byte[1024 * 1024]); // 1MB
//            list.add(data);
//
//            counter++;
//            if (counter % 100 == 0) {
//                System.out.println("Allocated: " + counter + "MB");
//            }
//        }
//    }

    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        while (true) {
            submitTask();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void submitTask() {
        executor.submit(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                checkSomething();
            }
        });
    }

    private static void checkSomething() {
        String dummy = System.getProperty("user.name");
        dummy.contains("a");
    }
}