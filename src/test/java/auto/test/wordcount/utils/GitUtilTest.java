package auto.test.wordcount.utils;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static auto.test.wordcount.utils.FileUtil.generateEmptyFile;

public class GitUtilTest {

    @Test
    public void cloneRepo() throws GitAPIException, IOException, InterruptedException {
        String url = "https://gitee.com/GreyZeng/clonable";
        String[] fileA = generateEmptyFile();
        String[] fileB = generateEmptyFile();
        GitUtil.cloneRepo(url, fileA[0], true);
        GitUtil.cloneRepo(url, fileB[0], false);
        System.out.println("完成下载，接下来会休眠60秒，请手动查看Git仓库是否正常下载下来，休眠60秒以后，clone的文件会删除！！！！！");
        TimeUnit.SECONDS.sleep(60);
        FileUtil.deleteFile(new File(fileA[0]));
        FileUtil.deleteFile(new File(fileB[0]));
    }
}