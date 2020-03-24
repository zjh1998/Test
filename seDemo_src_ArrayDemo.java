import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int[] intArray =new int[5];
	String valueString= sc.next();
	for (int i=0;i< intArray.length;i++){
		System.out.println("请输入一个整形");
		intArray[i]=sc.nextInt();

	}
	System.out.println(intArray);
	
}
}
