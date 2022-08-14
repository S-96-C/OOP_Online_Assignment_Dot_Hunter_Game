import java.util.Random;//to get random number

//Green Soldier Class
public class GreenSoldier implements Soldier{

	  private int xAxis;
	  private int yAxis;

	  public GreenSoldier(){
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
	    System.out.println("Killed using a knife");
	    System.out.println("Game Over");
	  }

	  @Override
	  public void initialPos(){
	    Random coordinates = new Random();
	  //Assign Wall Boundary Sizes
	    this.setXWall(coordinates.nextInt(250));
	    this.setYWall(coordinates.nextInt(360));
	  }
}
