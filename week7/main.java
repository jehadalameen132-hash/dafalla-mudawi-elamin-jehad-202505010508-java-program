public class main { 
    public static void main(String[] args) {
        // Instantiate the Air Conditioner and Microwave objects
        Appliance ac = new AirConditioner("Daikin");
        Appliance microwave = new Microwave("Samsung");

        // Execute actions for the Air Conditioner
        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();

        System.out.println(); // Empty line for spacing

        // Execute actions for the Microwave
        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
    }
}