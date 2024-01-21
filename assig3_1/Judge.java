package assig3_1;

public class Judge implements Runnable {
	
	//Yarin Ackerman 
	//Rami Abu Rabia 
	
	private GamePlay game;
	
	Judge(GamePlay game){
		
		this.game=game;
	}

	@Override
	public void run() {
		
		while(!Thread.interrupted()&&game.getNumOfRound()<=10) {
			
			try {
				
				game.makeCoinAvail(false);
				Thread.sleep(1000);
				
				game.makeCoinAvail(true);
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	

}
