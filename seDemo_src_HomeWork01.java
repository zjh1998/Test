import java.util.Scanner;

public class HomeWork01 {

    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double sum = 0.0d;
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            sum += Double.parseDouble(s);
        }
            System.out.println(str + " 平均数是：" + sum / strArr.length);
        }

}
