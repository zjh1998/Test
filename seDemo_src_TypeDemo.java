public class TypeDemo {
	public static void main(String[] args) {
//		String info="10"; //等号后面的叫字面量
//		int intVal=10;
//		char charVal='1';
//		byte byteVal=10;
//		intVal=byteVal;
//		System.out.println(intVal);
//		System.out.println(info + intVal);
//		System.out.println(info + intVal + 10);
//		System.out.println(10 + intVal + info);
//		double dbVal= byteVal;
//		byte btVal=5;
//		intVal=byteVal + btVal; //byte做四则运算都是分别转换成int类型
//		System.out.println(byteVal + btVal);  
//		
//		long longVal=9999999999999l;
//		intVal = (int)longVal;
//		System.out.println(intVal);
//		
//		//基础工资
//		int salary=1000;
//		//绩效工资
//		int value=20;
//		//如果绩效超过500 发基本工资+绩效工资  如果绩效工资不超过500 只发绩效工资
//		System.out.println("总工资" + ( value > 500 ? value : 0 + salary));
		String gender="1"; 
		switch (gender) {
		case "1":
			System.out.println("性别为男");
			break;
		case "0":
			System.out.println("性别为女");
			break;
		default:
			System.out.println("未知性别");
			break;
		}
}
}
