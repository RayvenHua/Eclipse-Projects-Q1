package Code;
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

//      myFinch.playTone(100, 5000); //hz, ms
      int A3 = 220;
      int B3 = 247;
      int C4 = 262;
      int D4 = 294;
      int E4 = 330;
      int F4 = 349;
      int G4 = 392;
      int G3 = 196;
      int C3 = 132;
      
      int whole = 1000;
      int half = whole / 2;
      int quarter = half / 2;
      int eight = quarter / 2;
      
      myFinch.playTone(G3, eight);
      myFinch.playTone(G3, eight);
      myFinch.playTone(A3, quarter);
      myFinch.playTone(G3, quarter);
      myFinch.playTone(C3, quarter);
      myFinch.playTone(B3, half);
      myFinch.playTone(G3, eight);
      myFinch.playTone(G3, eight);
      myFinch.playTone(A3, quarter);
      myFinch.playTone(G3, quarter);
      myFinch.playTone(D4, quarter);
      myFinch.playTone(C4, half);
      myFinch.playTone(G3, eight);
      myFinch.playTone(G3, eight);
      myFinch.playTone(G4, quarter);
      myFinch.playTone(E4, quarter);
      myFinch.playTone(C4, quarter);
      myFinch.playTone(B3, quarter);
      myFinch.playTone(A3, whole);
      myFinch.playTone(F4, eight);
      myFinch.playTone(F4, eight);
      myFinch.playTone(E4, quarter);
      myFinch.playTone(C4, quarter);
      myFinch.playTone(D4, quarter);
      myFinch.playTone(C4, whole);
      
      

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

