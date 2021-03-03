package auto.test.wordcount.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/3/3
 * @since
 */
public class CmdUtil {
    /**
     * 执行CMD命令
     *
     * @param cmd
     * @throws IOException
     */
    public static void cmd(String cmd) throws IOException {
        Process process = Runtime.getRuntime().exec(cmd);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
