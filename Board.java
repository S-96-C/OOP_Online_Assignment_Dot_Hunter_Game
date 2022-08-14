public class Board{

	  public String typeOFDot;
	  public Hunter hunter;
	  public Soldier soldier[];
	  
	  //Constructor Calling
	  public Board(String typeOFDot, Hunter hunter, Soldier soldier[]){
	    this.typeOFDot = typeOFDot;
	    this.hunter = hunter;
	    this.soldier = soldier;
	    System.out.println("Board is ready and three soldiers and the hunter is positioned in the board");
	  }
}