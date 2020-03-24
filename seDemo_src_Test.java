public class Test {
	/*
	 * main是javase的入口
	 */
  public static void main(String[] args) {
	System.out.println("hello,world");
	String school="曲师大";
	System.out.println("我来自"+ school);
	System.out.println(getInfo(school));
}
  /*
   * 自定义的方法
   * 必须要其他的方法调用才能执行
   */
  private static String getInfo(String School){
	  return "我毕业于" + School;
  }
}
