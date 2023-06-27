import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test_2_17 {

    public static void main(String[] args) {
        new Test_2_17().run();
    }

    // 运行程序
    private void run() {
        try {
            // 计算并保存2 ~ 200之间的素数
            List<Integer> primeList = getPrimeNumList();
            savePrimeNum(primeList);

            // 从文件中读取素数并显示
            List<Integer> result = readPrimeNum();
            showResult(result);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 获取2 ~200之间的素数
    private List<Integer> getPrimeNumList() {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= 200; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    // 判断是否为素数
    private boolean isPrime(int num) {
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    // 保存素数到文件中
    private void savePrimeNum(List<Integer> primeList) throws IOException {
        File file = new File("prime.dat");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Integer prime : primeList) {
                writer.write(prime + "\n");
            }
            writer.flush();
        }
    }

    // 从文件中获取素数
    private List<Integer> readPrimeNum() throws IOException {
        List<Integer> primeList = new ArrayList<>();
        File file = new File("prime.dat");
        if (!file.exists()) {
            throw new IOException("文件不存在");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                primeList.add(Integer.parseInt(line));
            }
        }
        return primeList;
    }

    // 显示素数
    private void showResult(List<Integer> result) {
        for (Integer prime : result) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }

}