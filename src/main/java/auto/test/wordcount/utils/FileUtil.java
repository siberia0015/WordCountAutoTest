package auto.test.wordcount.utils;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/3/2
 * @since
 */
public class FileUtil {
    /**
     * 判断两个文件内容是否一样，注意：传入的是文件路径，而非文件内容！
     *
     * @param fileAPath 文件A的路径
     * @param fileBPath 文件B的路径
     * @param encoding  编码  如果不指定，默认UTF-8
     * @return 内容一致则返回true 不一致则返回false
     */
    public static boolean isSameContent(String fileAPath, String fileBPath, String encoding) {
        // TODO
        return false;
    }

    /**
     * 以指定编码读取文件内容, 注意文件大小要限制一下，否则内存容易爆掉
     *
     * @param filePath 文件路径
     * @param encoding 编码 如果不指定，默认UTF-8
     * @return
     */
    public static String content(String filePath, String encoding) {
        // TODO
        return null;
    }

    /**
     * 在rootFolder目录下，创建targetFolder名称的文件夹
     * eg：
     * rootFolder : c:/git
     * targetFolder: 12345
     * 执行后，则在git目录下创建了12345这个文件夹
     *
     * @param rootFolder   targetFolder所在的文件夹
     * @param targetFolder 需要创建的文件夹
     * @return 创建成功与否，成功为true，不成功为false
     */
    public static boolean createFolder(String rootFolder, String targetFolder) {
        // TODO
        return false;
    }

    /**
     * 删除一个文件或者文件夹，如果文件夹里面有内容，则里面的内容也要递归删除掉
     *
     * @param file 文件或者文件夹
     * @return
     */
    public static boolean deleteFile(String file) {
        // TODO
        return false;
    }
}
