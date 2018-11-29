import java.util.ArrayList;
public class Day2{
 	public static void main(String[]args){
	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(	list	);

	System.out.println(change(list));
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