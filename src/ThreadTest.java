import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by lalwa_000 on 09/02/2016.
 */
public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(()-> {
            String threadName = Thread.currentThread().getName();
            System.out.println("ThreadName  = [" + threadName + "]");
            System.out.println("Foo " + threadName);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Bar " + threadName);
        });
       // task.run();

        //Thread thread = new Thread(task);
        //thread.start();
        System.out.println("done");

        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
    }
}
