package assig3_1;

public class Main {
	
	//Yarin Ackerman 
	//Rami Abu Rabia 
	
	public static void main(String[]args) {
		
		
		GamePlay game = new GamePlay();
		Gamer player1 = new Gamer(game);
		Gamer player2 = new Gamer(game);
		Judge judge = new Judge(game);

		Thread t1 = new Thread(player1);
		Thread t2 = new Thread(player2);
		Thread judgeThread = new Thread(judge);

		t1.start();
		t2.start();
		judgeThread.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		if(player1.getScore()>player2.getScore()) {
			
			System.out.println("Player 1 is the winner, total score: "+player1.getScore()+":"+player2.getScore());
			
		}
		else if(player1.getScore()<player2.getScore()) {
			
			System.out.println("Player 2 is the winner, total score: "+player2.getScore()+":"+player1.getScore());		
		}
		else {
			System.out.println("tie");
		}
		
		
		
	}
	
	
}
