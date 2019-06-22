package chapter9;

public class Main {
	public static void main(String[] args) {
		Incrementable[] table = new Incrementable[2];
					table[0]= new SequentialIncrementer();
					table[1] = new RandomIncrementer();
					
					
					for (int i = 0; i < table.length; i++) {
						System.out.println(table[i]);
					}
		
	}

}
