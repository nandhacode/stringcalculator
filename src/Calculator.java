
public class Calculator {

//	public static void main(String[] args) {
//		
//	}
	public int sum(String value) {
		if(value.isEmpty())
		{
			return 0;
		}
		
		if(value.contains(",") || value.contains("\n")) {
			String[] num = value.split(",|\n");
			int add = 0;
			for(int i = 0;i<num.length; i++) {
				if(!num[i].equals("") ) {
					add += Integer.parseInt(num[i]);
				}
			}
			return add;
		}
		else
			return Integer.parseInt(value);
	}
}
