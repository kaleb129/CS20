package part5;
import com.phidget22.*;
public class AttachDetach {



	    public static void main(String[] args) throws Exception {
	       
	         
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	               
	                System.out.println("Temperature: " + e.getTemperature() + "°C");
	            }
	        });

	       
	        temperatureSensor.addAttachListener(new AttachListener() {
	            public void onAttach(AttachEvent e) {
	                System.out.println("Attach!");
	            }
	        });

	        
	        temperatureSensor.addDetachListener(new DetachListener() {
	            public void onDetach(DetachEvent e) {
	                System.out.println("Detach!");
	            }
	        });

	        temperatureSensor.open(1000);

	       
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	}
	 


