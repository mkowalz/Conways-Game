package gameOfLife;

public class Game {

	
	public static void main(String [] args){
		Box test = new Box(19);
		test.populate(0.30);
		test.print();
		for(int i = 0; i<1000; i++){
			test.turn();
			try {
			    Thread.sleep(500);                 
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			test.print();
		}
	}	
}
