package LambdaExerise2;

public class Program {
    public static void fire() {
        System.out.println("Fire!!!!");
    }
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        String message = "Пожар";

        //event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.addElectricityListener(new ElectricityConsumer() {
            public void electricityOn() {
                System.out.println(message);
            }
            } );

        sw.addElectricityListener( ()-> System.out.println("Fire") );

        sw.addElectricityListener(Program::fire);

        sw.switchOn();
    }
}
