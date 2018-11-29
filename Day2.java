import java.util.ArrayList;
public class Day2{
 	public static void main(String[]args){
		int num = 8950;
		System.out.println(convertToArrayList(num));
 	}

 	public static ArrayList<Integer> convertToArrayList(int x){
		System.out.println("Method 1");
		ArrayList<Integer> list = new ArrayList<>();
		if(x<10000 && x>=1000){
			list.add(x/1000);
			x = x%1000;
		}
		if(x<1000 && x>=100){
			list.add(x/100);
			x = x%100;
		}
		if(x<100 && x>=10){
			list.add(x/10);
			x = x%10;
		}
		if(x<10 && x>= 0)
			list.add(x);

		return list;
	}

 }