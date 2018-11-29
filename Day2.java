import java.util.ArrayList;
public class Day2{
 	public static void main(String[]args){

	int num=8950;
	System.out.println(convertToArrayList(num));
	System.out.println(change(convertToArrayList(num)));

 	}

 	public static ArrayList<Integer> convertToArrayList(int x){
		System.out.println("Method 1");
		ArrayList<Integer> list = new ArrayList<>();
		if(x<10000 && x>=1000){
			list.add(x/1000);
			x = x%1000;
			list.add(x/100);
			x = x%100;
			list.add(x/10);
			x = x%10;
			list.add(x);
		}
		if(x<1000 && x>=100){
			list.add(x/100);
			x = x%100;
			list.add(x/10);
			x = x%10;
			list.add(x);
		}
		if(x<100 && x>=10){
			list.add(x/10);
			x = x%10;
			list.add(x);
		}
		if(x<10 && x>= 0)
			list.add(x);
		return list;
	}

 	public static int change(ArrayList<Integer> list){
		int a=0;
		for(int i=0;i<list.size();i++){
			if(list.size()==4){
				int mult=1000;
				a+=list.get(i)*mult;
				mult/=10;
				list.remove(i);
			}
			if(list.size()==3){
				int mult=100;
				a+=list.get(i)*mult;
				mult/=10;
				list.remove(i);

			}
			if(list.size()==2){
				int mult=10;
				a+=list.get(i)*mult;
				mult/=10;
				list.remove(i);

			}
			if(list.size()==1){
				int mult=1;
				a+=list.get(i)*mult;
				mult/=10;
				list.remove(i);

			}
	}
	return a;
 }
}

