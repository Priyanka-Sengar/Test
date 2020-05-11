package StringProgram;

public class reverseword {
	
	public static void reverseword()
	{
		String value="My name is priyanka";
		String reverse="";
		String array[]=value.split("\\s");
		
		for(int i=0;i<value.length();i++)
		{
			String word = array[i]; 
			String reversearray="";
			for(int j=value.length()-1;j>=0;j--)
			{
			reversearray=reversearray+word.charAt(j);
			}
		
		reverse=reverse+reversearray+" ";
		}
		System.out.println(value);
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {
		reverseword();

	}

}
