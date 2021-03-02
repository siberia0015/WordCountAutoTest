## 本测试程序参考北航的自动测试程序

https://github.com/ZhaoYi1031/WordCountAutoTest

## 说明

项目进行了一些调整，采用maven来管理，这样依赖的管理和项目目录会清晰一些，由于原先的代码不太适用我们的作业要求，所以我们需要对代码进行一些改造

改造之前，由于我们需要先抽取出一些API，这些API或多或少在原项目中都有实现，我们可以作为参考

目前这边想到功能大约有这些：

1. 从Git克隆项目到本地
2. 生成测试数据
    - 按照指定的配置（字符数量，行数量，单词数量），生成对应的测试txt文件，并把这些txt存放到指定的位置（通过配置文件指定）
    - 把这个txt对应的答案文件存在指定目录下
3. 编译并执行同学们的代码，执行的输入文件就是第2步中的txt文件，生成的测试结果和第二步中的答案进行对比
4. 将每个同学执行的用例通过数记录下来，存入csv文件中。


具体API

## FileUtil 已完成

## GitUtil 已完成

## CSVUtil

```java
/**
 * 生成CSV
 *
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/3/2
 * @since
 */
public class CSVUtil {
    /**
     * 将content写入csv中
     * PS： content的格式请写这个API的人定好
     * csvLocation是csv的路径，如果不存在，需要新建
     *
     * @param content     内容
     * @param csvLocation csv的路径
     * @return 如果成功则返回true，不成功则返回false
     */
    public static boolean exportToCSV(String content, String csvLocation) {
        // TODO
        // 参考auto.test.wordcount.Main.java文件中第100，101行
        return false;
    }
}
```

## Executor接口，用于执行程序并测试

```java
public interface Executor {
    /**
     * 执行程序
     *
     * @param src    源码目录
     * @param input  测试用例
     */
    Result exec(String src, String input);
}
```

不同语言实现这个接口即可，例如:

### Java测试程序

```java
public class JavaExecutor implements Executor {
    @Override
    public Result exec(String src, String input) {
        // TODO
        return null;
    }
}
```

### C++测试程序

```java
public class CppExecutor implements Executor {
    @Override
    public Result exec(String src, String input) {
        // TODO
        return null;
    }
}
```

### Python测试程序

```java
public class PythonExecutor implements Executor {
    @Override
    public Result exec(String src, String input) {
        // TODO
        return null;
    }
}
```

### NodeJS测试程序



