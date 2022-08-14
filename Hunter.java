class Hunter{
	  
	  private String Name;
	  private String Colour;
	  public int xPosition;
	  public int yPosition;

	  //Constructor Calling
	  public Hunter(String Name, String Colour){
	    this.Name =Name;
	    this.Colour =Colour;
	  }

	  //Wall Boundary Fixed the Sizes
	  //Setters
	  public void setxPOS(int xPosition){
		 
		//Loop Condition
		//Use try catch
	    if(xPosition > 250){
	      try{
	        throw new SoundException();
	      }catch(SoundException e){
	        System.out.println(e);
	      }
	    }
	    else{
	      this.xPosition =xPosition;
	    }
	  }

	  //Setters
	  public void setYPOS(int yPosition){
	    if(yPosition > 360){
	      try{
	        throw new SoundException();
	      }catch(SoundException e){
	        System.out.println(e);
	      }
	    }

	    else{
	      this.yPosition =yPosition;
	    }
	  }

	  public void move(Hunter hunter){
	    System.out.println("Hunter is moving, X:" +(hunter.xPosition + "") + " Y:" + (hunter.yPosition));
	  }

	  public void initialPos(){}

	  //Player controls the Hunter
	  public void hunt(Board board){
		 
		//When hunter hunts super dots
		//Can shoot the soldiers down
	    if(board.typeOFDot == "superDot"){
	      System.out.println("Hunting super dots ");
	    }

	    else{
	      System.out.println("Hunting dots");
	    }
	  }
	}
