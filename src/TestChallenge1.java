

   // TODO Complete the provided Sentry class by implementing its patrol() method

	
		// TODO Load a default map 
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely




import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot;

public class TestChallenge1 {
public static void patrol(Sentry arg)

{

while (arg.nextToABeeper())
      {
       Dooby.turnRight();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
}

public static void main(String[] args) {
		 
       
		 Display.openWorld("maps/default.map");
		 Display.setSize(10, 10);
		 Display.setSpeed(10);
       
       Sentry Dooby = new Sentry(9, 3, Display.WEST, 5);
		 
       Dooby.putBeeper();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.putBeeper();
       Dooby.turnRight();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.putBeeper();
       Dooby.turnRight();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.putBeeper();
       Dooby.turnRight();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       Dooby.move();
       patrol(Dooby);
       
 }
 
 }
 
 }
       

       
       
   
  

       

       
       
       
       
   
      