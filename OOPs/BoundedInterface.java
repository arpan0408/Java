interface Printable{
	public void print();
}

class Studentt implements Printable{
	public void print(){
		System.out.println("Student details.");
	}
}
class Employeee implements Printable{
	public void print(){
		System.out.println("Employee details.");
	}
}

class Testt<T extends Printable>{
	T obj;
	public Testt(T obj){
		this.obj = obj;
	}
	
	public void display(){
		obj.print();
	}
}

public class BoundedInterface {
	public static void main(String[] args){
		Testt<Studentt> std = new Testt<Studentt>(new Studentt());
		std.display();
		
		Testt<Employeee> emp = new Testt<Employeee>(new Employeee());
		emp.display();
	}
}
