package auto.test.wordcount.utils;


/**
 * Git的相关操作
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/3/2
 * @since
 */
public class GitUtil {
    /**
     * 克隆url到指定目录
     * eg
     * url：https://github.com/GreyZeng/WordCountAutoTest.git
     * localPath: C:/git/download
     * 则执行完毕后，会在C盘git目录下的download目录下，会有一个文件夹名称为WordCountAutoTest的仓库
     * 不需要考虑目录存在与否的情况，假设给的localPath是合法的，由调用这个API的地方来判断
     *
     * @param url
     * @param localPath
     * @return 是否克隆成功, 成功为true，不成功为false
     */
    public static boolean cloneRepo(String url, String localPath) {
        // TODO
        return false;
    }
}
