
public class Calculator {

//	public static void main(String[] args) {
//		
//	}
	public int sum(String value) {
		if(value.isEmpty())
		{
			return 0;
		}
		return Integer.parseInt(value);
	}
}
