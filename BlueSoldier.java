import java.util.Random;//to get random number

//Blue Soldier Class
public class BlueSoldier implements Soldier{
	  
	  private int xAxis;
	  private int yAxis;
	  
	  public BlueSoldier(){
	    initialPos();
	  }
	  
	  //Setters
	  public void setXWall(int xAxis){
	    this.xAxis =xAxis;
	  }

	  //Setters
	  public void setYWall(int yAxis){
	    this.yAxis =yAxis;
	  }

	  @Override
	  public void hunt(){
	    System.out.println("Killed using a gun");
	    System.out.println("Game Over.");
	  }

	  @Override
	  public void initialPos(){
	    Random coordinate = new Random();
	    //Assign Wall Boundary Sizes
	    this.setXWall(coordinate.nextInt(250));
	    this.setYWall(coordinate.nextInt(360));
	  }
	}
