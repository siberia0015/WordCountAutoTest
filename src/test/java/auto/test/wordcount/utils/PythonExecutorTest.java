package auto.test.wordcount.utils;

import auto.test.wordcount.executor.PythonExecutor;
import org.junit.jupiter.api.Test;

public class PythonExecutorTest {
    @Test
    public void test(){
        try{
            PythonExecutor executor = new PythonExecutor();
            executor.exec("E:\\Python\\code\\lianxi\\print.py", null);
            // executor.exec("E:\\Python\\code\\lianxi\\print.py", "input.txt out.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
