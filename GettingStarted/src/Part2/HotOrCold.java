/*

Program: HotOrCold.java          Last Date of this Revision: June 4, 2026

Purpose: Measures temperature


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/
package Part2;

import com.phidget22.*;

public class HotOrCold 
{
	

	    public static void main(String[] args) throws Exception {

	      
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	       
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	      
	        temperatureSensor.open(1000);
	        redLED.open(1000);
	        greenLED.open(1000);

	      
	        while (true) {

	            double tempC = temperatureSensor.getTemperature();
	            double tempF = tempC * 1.8 + 32;

	        
	            System.out.println("Temperature: " + tempC + " °C (" + tempF + " °F)");

	            
	            if (tempC >= 20 && tempC <= 24) {
	                greenLED.setState(true);
	                redLED.setState(false);
	            } else {
	                greenLED.setState(false);
	                redLED.setState(true);
	            }

	            Thread.sleep(150);
	        }
	    }
	}

