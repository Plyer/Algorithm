package cn.flyago.geekbang;

/**
 * @author lvjinglu
 * created at 2019/10/12
 */

/**
 * 问题:
 * 假设我们现在需要对 D，a，F，B，c，A，z 这个字符串进行排序，
 * 要求将其中所有小写字 母都排在大写字母的前面，但小写字母内部和大写字母内部不要求有序。
 * 比如经过排序之后 为 a，c，z，D，F，B，A，这个如何来实现呢?
 * 如果字符串中存储的不仅有大小写字母， 还有数字。要将小写字母的放到前面，大写字母放在最后，数字放在中间，不用排序算法， 又该怎么解决呢?
 */
public class BacketSort {

    public static String sort(String src) {
        if (src == null) {
            return null;
        }

        StringBuilder backet1 = new StringBuilder();
        StringBuilder backet2 = new StringBuilder();
        StringBuilder backet3 = new StringBuilder();

        for (char c : src.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                backet1.append(c);
            } else if (Character.isDigit(c)) {
                backet2.append(c);
            } else {
                backet3.append(c);
            }
        }

        return backet1.toString() + backet2.toString() + backet3.toString();
    }

    public static void main(String[] args) {
        String src = "123AB123ABVaA1b";
        String result = BacketSort.sort(src);
        System.out.println(result);
    }
}
