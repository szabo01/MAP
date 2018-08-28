package exercicio.tres.b;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Example of parameterized factory method.
 * 
 * More information:
 * <ul>
 * <li>https://www.safaribooksonline.com/library/view/head-first-design/0596007124/ch04.html
 * <li>http://www.oodesign.com/factory-pattern.html
 * </ul>
 */
class Parameterized  { 
    private Parameterized() {}  
    // Interfaces.
    private interface Car {
        String showInfo();
    }
    private enum Type {
        HATCH, SEDAN, HYUNDAI, HVU, HRV;
    }
    private abstract static class CarFactory {
        abstract Car createCar(Type type);
        void deliver(Car car, String place) {
            System.out.println("Delivering " + car.showInfo() + " to " + place);
        } 
    }

    // Implementation.
    private static class Palio implements Car {
        public String showInfo() { return "Palio. Hatch from Fiat"; }
    }
    private static class Siena implements Car {
        public String showInfo() { return "Siena. Sedan from Fiat"; }
    }
    
    private static class Hb20 implements Car {
    	public String showInfo() { return "Hb20. from Hyundai";}
		
    }
    
    private static class Hb20s implements Car {
    	public String showInfo() { return "Hb20s. from Hyundai";}
		
    }
    
    private static class Hiunday extends CarFactory{

		@Override
		Car createCar(Type type) {
			switch (type) {
            case HATCH:
                return new Palio();
            case SEDAN:
                return new Siena();
            case HVU: 
            	return (Car) new Hiunday();
            case HRV:
            	return (Car) new Hiunday();
            	
            default:
            	
                throw new IllegalArgumentException(); 
        }
		}
    	
    }
    private static class Fiat extends CarFactory {
        Car createCar(Type type) {
            switch (type) {
                case HATCH:
                    return new Palio();
                case SEDAN:
                    return new Siena();
                default:
                    throw new IllegalArgumentException(); 
            }
        }
    }

    public static void main(String []args) {
        Parameterized.CarFactory fiat = new Parameterized.Fiat();
        System.out.println("Fiat factory creates " + fiat.createCar(Type.HATCH).showInfo());
        System.out.println("Fiat factory creates " + fiat.createCar(Type.SEDAN).showInfo());
        System.out.println("Fiat factory creates " + fiat.createCar(Type.HYUNDAI).showInfo());
    }

}