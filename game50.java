public class game50{
  
  static final int SIZE = 50; // target score to be equaled or exceeded
  private int bound; // number of allowable rolls to reach 50
  private int rollCount;  // number of rolls
  private int total;  // accumulated dice roll sum
  private boolean winner;  // game a win or loss?
    
  public game50(int rollBound){
      bound = rollBound; // rollBound value supplied in constructor call in driver class
    } 

  public void playGame(){
   initializeGame();
    
   while(!gameOver()){
     advancePlay();
     showGame();
   }
   judgeAndReport();
  }
  private void advancePlay(){
     int j = roll();  // rolls a pair of dice
     rollCount++;
     incrementTotal(j);
   }
//end of given code from - "Interactive Java: An Online Approach to Java Learning"
  
//Pembroke High School AP CSA 
//Andrew Jacobson
// 2/14/21
  
private void incrementTotal(int curRoll){
     total = total + curRoll;
   }
  private void showGame(){
     for(int i = 1; i <= SIZE; i++)
       if (i == total) System.out.print(i);
       else System.out.print('x');
     if (total > SIZE) System.out.print(total);
     System.out.println();
    }
  private void judgeAndReport(){
     if ((total < SIZE) || (total == 13)) winner = false;
     System.out.print("Rolls made: " + rollCount + "  ");
     System.out.println("Winner?: " + winner);
  }
  public void initializeGame() {
 	  winner = true;
	  rollCount = 0;
	  total = 0;
  }

  public boolean gameOver(){
	  if (rollCount >= bound || total >= SIZE || total == 13)
		  return true;
  	return false;
  }

  public int roll() {
	  int val = (int) (Math.random()*6) + 1;
	  int val2 = (int) (Math.random()*6) + 1;
	  return val + val2;
  }
}
