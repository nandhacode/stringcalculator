
public class Calculator {

//	public static void main(String[] args) {
//		
//	}
	public int sum(String value) {
		if(value.isEmpty())
		{
			return 0;
		}
		
		if(value.contains(",")) {
			String[] num = value.split(",");
			int add = 0;
			for(int i = 0;i<num.length; i++) {
				add += Integer.parseInt(num[i]);
			}
			return add;
		}
		else
			return Integer.parseInt(value);
	}
}
