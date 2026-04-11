import java.util.*;
public class WildCard {
	private static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number num : list)
			sum += num.doubleValue();
		return sum;
	}
	public static void main(String[] args){
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		List<Double> dub = Arrays.asList(10.0,20.5,9.9,1.1);
		
		System.out.println("Sum of integers: "+sum(num));
		System.out.println("Sum of double: "+sum(dub));
	}
}
