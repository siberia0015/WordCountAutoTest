package auto.test.wordcount.executor;

import auto.test.wordcount.Result;

import java.io.File;
import java.io.IOException;

import static auto.test.wordcount.utils.CmdUtil.cmd;
import static auto.test.wordcount.utils.FileUtil.getFolder;

/**
 * Python执行程序
 *
 * @author yxy
 * @date 2021/3/4
 * @since
 */
public class PythonExecutor implements Executor {
    @Override
    public void exec(String mainFile, String input) {
        python(mainFile, input);
    }

    /**
     * 执行Python程序
     * python [文件地址] [参数]
     * @param filePath 指定要执行的python文件的地址，如果不指定，则默认为WordCount.py
     * @param input     输入参数，应为"input.txt output.txt"
     */
    public void python(String filePath, String input) {
        try {
            if (null != input && !input.trim().equals("")) {
                System.out.println("python " + filePath);
                cmd("python " + filePath);
            } else {
                System.out.println("python " + filePath + " " + input);
                cmd("python " + filePath + " " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
