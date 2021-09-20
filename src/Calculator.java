
class NegativeNumberException extends  RuntimeException
{
	String result;
	public NegativeNumberException(String key)
	{
		super(key);
	}
}




public class Calculator {

//	public static void main(String[] args) {
//		
//	}
	public int sum(String value) {
		if(value.isEmpty())
		{
			return 0;
		}
		
		String delimiter = ",|\n";
		if(value.startsWith("//")) {
			String[] part = value.split("\n", 2);
			delimiter = part[0].substring(2);
			value = part[1];
			String[] num = value.split(delimiter);
			int add = 0;
			for(int i = 0;i<num.length; i++) {
				if(!num[i].equals("")) {
					if(Integer.parseInt(num[i]) < 1000) {
						add += Integer.parseInt(num[i]);
					}
					
				}
			}
			return add;
		}
		
		if(value.contains(",") || value.contains("\n")) {
			String[] num = value.split(",|\n");
			int add = 0;
			for(int i = 0;i<num.length; i++) {
				if(!num[i].equals("") ) {
					if(Integer.parseInt(num[i]) < 1000) {
						add += Integer.parseInt(num[i]);
					}
				}
			}
			return add;
		}
		else
			try {
				if(Integer.parseInt(value) < 0)
				{
					throw new NegativeNumberException("negatives not allowed"); 
				}
				else
					return Integer.parseInt(value);
			}
			catch(NegativeNumberException e)
			{
				throw e;
			}
			
	}
}
