
public class Throw {
	public static void main(String[]args){
		try{
			throw new NullPointerException("Hello");
		}
		catch(NullPointerException a){
			System.out.println(a);
			System.out.println("Massage: "+a.getMessage());
			a.printStackTrace();
		}
	}
}
