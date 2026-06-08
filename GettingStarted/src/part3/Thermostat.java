package part3;

import com.phidget22.*;

public class Thermostat {
   public static void main(String[] args) throws Exception
   {
       
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       
       DigitalInput greenButton = new DigitalInput();
       DigitalInput redButton = new DigitalInput();
    
       DigitalOutput greenLED = new DigitalOutput();
       DigitalOutput redLED = new DigitalOutput();
   
       greenButton.setHubPort(5);
       greenButton.setIsHubPortDevice(true);
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
      
       greenLED.setHubPort(4);
       greenLED.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);
     
       temperatureSensor.open(1000);
       greenButton.open(1000);
       redButton.open(1000);
       greenLED.open(1000);
       redLED.open(1000);
       
       int setTemperature = 21;
       boolean lastGreenState = false;
       boolean lastRedState = false;
       int timer = 0;
     
       while (true)
       {
           double currentTemp = temperatureSensor.getTemperature();
           boolean greenState = greenButton.getState();
           boolean redState = redButton.getState();
         
           if (greenState && !lastGreenState)
           {
               setTemperature++;
           }
          
           if (redState && !lastRedState)
           {
               setTemperature--;
           }
           lastGreenState = greenState;
           lastRedState = redState;
       
           if (Math.abs(currentTemp - setTemperature) <= 2)
           {
               greenLED.setState(true);
               redLED.setState(false);
           }
           else
           {
               greenLED.setState(false);
               redLED.setState(true);
           }
           
           if (timer >= 67)
           {
               System.out.println("Current Temperature: " + currentTemp + " °C");
               System.out.println("Set Temperature: " + setTemperature + " °C");
               System.out.println("---------------------------");
               timer = 0;
           }
           timer++;
           Thread.sleep(150);
       }
   }
}

