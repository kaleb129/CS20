/*

Program: TugOfWar.java          Last Date of this Revision: June 4, 2026

Purpose: Tug of war game played using the phidget


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/



import com.phidget22.*;

public class TugOfWar 

{
    static int redCount = 0;
    static int greenCount = 0;
    static final int TARGET = 10;

    public static void main(String[] args) throws Exception 
    {
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(5000);
        greenButton.open(5000);
        redLED.open(5000);
        greenLED.open(5000);

        System.out.println("Game started first person to press 10 times wins");

        redButton.addStateChangeListener(e -> 
        {
            if (e.getState() && redCount < TARGET && greenCount < TARGET) 
            {
                redCount++;
                System.out.println("Red: " + redCount + " | Green: " + greenCount);
                if (redCount == TARGET) 
                {
                    try { flashWinner(redLED, greenLED, true); 
                    }
                    catch (Exception ex) { ex.printStackTrace(); 
                    }
                }
            }
        });

        greenButton.addStateChangeListener(e -> {
            if (e.getState() && redCount < TARGET && greenCount < TARGET) 
            {
                greenCount++;
             
                System.out.println("Red: " + redCount + " | Green: " + greenCount);
                if (greenCount == TARGET) {
                    try { flashWinner(greenLED, redLED, false); 
                    }
                    catch (Exception ex) { ex.printStackTrace(); 
                    }
                }
            }
        });

        
        Thread.sleep(60000);

        redButton.close();
        greenButton.close();
        redLED.close();
        greenLED.close();
    }

    static void flashWinner(DigitalOutput winnerLED, DigitalOutput loserLED, boolean redWon) throws Exception {
        System.out.println((redWon ? "RED" : "GREEN") + " WINS");

       
        winnerLED.setState(true);
        loserLED.setState(true);
        Thread.sleep(500);
        winnerLED.setState(false);
        loserLED.setState(false);
        Thread.sleep(500);

        
        for (int i = 0; i < 5; i++) {
            winnerLED.setState(true);
            Thread.sleep(300);
            winnerLED.setState(false);
            Thread.sleep(300);
        }
    }
}
/* 
Game started first person to press 10 times wins
Red: 0 | Green: 1
Red: 1 | Green: 1
Red: 1 | Green: 2
Red: 2 | Green: 2
Red: 2 | Green: 3
Red: 3 | Green: 3
Red: 3 | Green: 4
Red: 4 | Green: 4
Red: 4 | Green: 5
Red: 5 | Green: 5
Red: 5 | Green: 6
Red: 6 | Green: 6
Red: 6 | Green: 7
Red: 7 | Green: 7
Red: 7 | Green: 8
Red: 8 | Green: 8
Red: 8 | Green: 9
Red: 9 | Green: 9
Red: 9 | Green: 10
GREEN WINS
*/