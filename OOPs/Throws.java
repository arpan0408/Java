
public class Throws {
	public static void main(String[]args) throws Exception{
		int[] arr = {1,2,3,3,4,4};
		
		try{
			for(int i=0; i<7; i++)
			System.out.println(arr[i]+" ");
			
			System.out.println("Hello");
		}	
		catch(ArrayIndexOutOfBoundsException a){
		System.out.println("Index not found!");
		System.out.println(a);
		a.printStackTrace();
	}
	}

}
