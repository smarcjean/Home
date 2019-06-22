	package chapter10;
	
	import java.util.ArrayList;
	
	public class ScaleByK {
		public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(4);
			list.add(1);
			list.add(2);
			list.add(0);
			list.add(3);
			
			scaleByK(list);
			
		}
		
		public static void scaleByK(ArrayList<Integer> list) {
			
			int k = 0;
			
			while(k < list.size()){
				int value = list.get(k);
				
				if(value > 0){
					for(int j = 1; j < value; j++){
						list.add(k + j, value);
					}
					
					k += value;
				} else{
					list.remove(k);
				}
			}
			System.out.println(list);
	
		}
	
	}
