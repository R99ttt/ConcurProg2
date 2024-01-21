package assig3_1;

public class Gamer implements Runnable {
	
	//Yarin Ackerman 
	//Rami Abu Rabia 

	private int goodFlipsCounter;
	private GamePlay game;
	
	public Gamer(GamePlay game) {
		
		goodFlipsCounter=0;
		this.game=game;
	}
	
	public void play() throws InterruptedException {
		
		while(!Thread.interrupted()&&game.getNumOfRound()<=10) {
			
			if(game.flipCoin()) {
				
				goodFlipsCounter++;
			}
			
			Thread.sleep(1000);
		}
	}
	
	public int getScore() {
		
		return goodFlipsCounter;
	}

	public void run() {
		
		try {
			
			play();
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
