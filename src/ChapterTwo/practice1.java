package ChapterTwo;

/**
 * @author kisooon
 * 练习1：验证Java执行默认初始化
 */
public class practice1 {
    static int isAIntValue;
    static char isACharValue;

    public static void main(String args[]) {
        DoPrint();
    }

    public static void DoPrint() {
        System.out.println("isAIntValue=" + isAIntValue + "\nisACharValue=" + isACharValue);
    }
}
/**
 * The answer:
 * isAIntValue=0
 * isACharValue=
 */
