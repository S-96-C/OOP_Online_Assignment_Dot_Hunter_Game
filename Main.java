import java.util.Scanner;
import java.util.Set;

public class Main{

	  public static void main(String[] arg){

	    Scanner sc=new Scanner(System.in);

	    Hunter myhunter =new Hunter("Maha Deva", "Brown");

	    Soldier threeSoldiers[]= {new RedSoldier(), new RedSoldier(), new GreenSoldier()};

	    Board myboard =new Board("superDot", myhunter, threeSoldiers);

	    System.out.println("Use the keyboard up,down,left ,right arrow keys to move the hunter");

	    myhunter.setxPOS(sc.nextInt());

	    myhunter.setYPOS(sc.nextInt());

	    myhunter.move(myhunter);

	    myhunter.hunt(myboard);

	    threeSoldiers[2].hunt();

	  }
}