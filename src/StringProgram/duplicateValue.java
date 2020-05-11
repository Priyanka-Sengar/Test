package StringProgram;

public class duplicateValue {

	public static void main(String[] args) {
		int array[]={1,2,4,2,5,4,5};
		int count=0 ;
		for(int i=1;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					
					count++;
					System.out.println("value"+array[i]+"count"+count);
					
				}
				
			}
		}

	}

}
