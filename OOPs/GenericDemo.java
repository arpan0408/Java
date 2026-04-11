class Test<T extends Number>{
	T t;
	public Test(T t){
		this.t = t;
	}
	
	public T getT(){
		return t;
	}
}

public class GenericDemo {
	public static void main(String[] args){
		Test<Number> obj = new Test<Number>(123);
		System.out.println("Integer value : "+obj.getT());
		
		Test<Double> obj2 = new Test<Double>(55.0);
		System.out.println("Double value: "+obj2.getT());
		
		//Test<String> obj3 = new Test<String>("this is a string");
		//System.out.println("String value: "+obj3.getT());
	}
}
