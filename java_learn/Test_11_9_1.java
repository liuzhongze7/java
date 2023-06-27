import java.util.Scanner;

public class Test_11_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入杨辉三角形的行数：");
        int n = scanner.nextInt();
        int[][] triangle = new int[n][n];

        // 填充杨辉三角形的数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }

        // 打印杨辉三角形
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
