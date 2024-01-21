package assig3_1;

public class GamePlay {
	
	//Yarin Ackerman 
	//Rami Abu Rabia 
	
	private boolean coinAvailable=true;
	private int roundCounter=1;
	
	public synchronized void makeCoinAvail(boolean val) {
		
		if(val) {
			
			this.coinAvailable=true;
			notifyAll(); 
		}
		else {
			
			this.coinAvailable=false;
		}
	}
	
	public synchronized boolean flipCoin() throws InterruptedException {
			
		while(!coinAvailable) {
			
			System.out.println(Thread.currentThread().getName()+" is waiting to join");
			wait();
			
		}	
		
			
		System.out.println(Thread.currentThread().getName()+" is flipping coin");
		roundCounter++;			
		
		int result = (int)Math.round(Math.random());
		
		makeCoinAvail(true);
		
		return result==1;
	}
	
	public int getNumOfRound() {
		
		return roundCounter;
	}
	
	
	
	
}
