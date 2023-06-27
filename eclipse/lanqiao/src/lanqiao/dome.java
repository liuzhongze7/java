package lanqiao;

public class dome {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if (isPalindrome(i) && check(i)) {
                count++;
            }
            i = nextPalindrome(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println("共用时" + (end - start) / 1000 % 60 + "秒");//时间大大降低，仅用0.1s左右
    }
​
    private static int nextPalindrome(int num) {
        String s = num + "";
        int n = s.length();
        if (n % 2 == 0) {
            int half = n / 2;
            int left = Integer.parseInt(s.substring(0, half));
            int right = Integer.parseInt(s.substring(half));
            if (right < left) {//下一位数字比当前数字的最后一位数字小，更新最后一位数字
                String nextRight = String.valueOf(left);
                nextRight = nextRight + new StringBuilder(nextRight).reverse().toString();
                return Integer.parseInt(nextRight);
            } else {//下一位数字比当前数字的最后一位数字大或相等，继续向后遍历
                int nextLeft = left + 1;
                if (nextLeft >= Math.pow(10, half)) {//需要进位，则调整中间的数字
                    char[] middle = String.valueOf(nextLeft).toCharArray();//转为字符数组，方便修改中间数字
                    middle[half - 1] = '0';
                    nextLeft = Integer.parseInt(String.valueOf(middle));
                    return Integer.parseInt(nextLeft + new StringBuilder(String.valueOf(nextLeft)).reverse().toString());
                } else {
                    return Integer.parseInt(nextLeft + new StringBuilder(String.valueOf(nextLeft)).reverse().toString());
                }
            }
        } else {
            int half = n / 2;
            int left = Integer.parseInt(s.substring(0, half + 1));
            int right = Integer.parseInt(s.substring(half));
            if (right < left % 10) {//下一位数字比当前数字的最后一位数字小，更新最后一位数字
                String nextRight = String.valueOf(left / 10);
                nextRight = nextRight + new StringBuilder(nextRight.substring(0, half)).reverse().toString();
                return Integer.parseInt(nextRight);
            } else {//下一位数字比当前数字的最后一位数字大或相等，继续向后遍历
                int nextLeft = left + 1;
                if (nextLeft >= Math.pow(10, half + 1)) {//需要进位，则调整中间的数字
                    char[] middle = String.valueOf(nextLeft).toCharArray();//转为字符数组，方便修改中间数字
                    middle[half] = '0';
                    nextLeft = Integer.parseInt(String.valueOf(middle));
                    return Integer.parseInt(nextLeft + new StringBuilder(String.valueOf(nextLeft).substring(0, half)).reverse().toString());
                } else {
                    return Integer.parseInt(nextLeft + new StringBuilder(String.valueOf(nextLeft).substring(0, half)).reverse().toString());
                }
            }
        }
    }

    private static boolean isPalindrome(int num) {
        String s = num + "";
        int n = s.length() - 1;
        for (int l = 0, r = n; l < r; l++, r--) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
        }
        return true;
    }

    private static boolean check(int num) {
        String s = num + "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

