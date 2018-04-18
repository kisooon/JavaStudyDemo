package Practice;

public class VampireDigit {
    /**
     * 3      * 吸血鬼数字算法
     * 4      * 如：12*60=1260
     * 5      * YangL.
     * 6
     */
    public static void main(String[] args) {
        String[] ar_str1 = null, ar_str2;
        int sum = 0;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int i_val = i * j;
                if (i_val < 1000 || i_val > 9999)
                    continue; // 积小于1000或大于9999排除,继续下一轮环
                count++;
                //String.valueOf 将数值转换成字符串
                //split（）为以括号内部的符号为分隔符将字符串转换成字符数组
                ar_str1 = String.valueOf(i_val).split("");
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                java.util.Arrays.sort(ar_str1);
                java.util.Arrays.sort(ar_str2);
                if (java.util.Arrays.equals(ar_str1, ar_str2)) {
                    // 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "="
                            + i_val);
                }
            }
        }
        System.out.println("共找到" + sum + "组吸血鬼数" + "\ncount" + count);
    }
}