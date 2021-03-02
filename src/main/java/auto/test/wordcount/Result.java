package auto.test.wordcount;

/**
 * @author <a href="mailto:410486047@qq.com">Grey</a>
 * @date 2021/3/2
 * @since
 */
public class Result {
    /**
     * 代码目录
     */
    private String src;
    /**
     * 输出结果
     */
    private String output;
    /**
     * 测试用例
     */
    private String input;
    /**
     * 花费时间
     */
    private Long cost;
    /**
     * 得分
     */
    private Double score;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


}
