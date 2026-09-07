
abstract class Vehicle {

    int rangno;

    Vehicle(int rno) {
        rangno = rno;
    }

    void fuel() {
        System.out.println("Fuel Tank");
    }

    abstract void SteeringSystem(int direction, int angle);

    abstract void BrakeSystem(int force);
}

class Santro extends Vehicle {

    Santro(int rno) {
        super(rno);
    }

    void SteeringSystem(int direction, int angle) {
        System.out.println("Santro Steering System");
    }

    void BrakeSystem(int force) {
        System.out.println("Santro Brake System");
    }
}

class Maruti extends Vehicle {

    Maruti(int rno) {
        super(rno);
    }

    void SteeringSystem(int direction, int angle) {
        System.out.println("Maruti Steering System");
    }

    void BrakeSystem(int force) {
        System.out.println("Maruti Brake System");
    }
}

class carDemo {

    public static void main(String[] args) {

        Santro s = new Santro(101);
        Maruti m = new Maruti(102);

        System.out.println("Santro Details:");
        System.out.println("Registration No: " + s.rangno);
        s.fuel();
        s.SteeringSystem(1, 30);
        s.BrakeSystem(50);

        System.out.println();

        System.out.println("Maruti Details:");
        System.out.println("Registration No: " + m.rangno);
        m.fuel();
        m.SteeringSystem(1, 30);
        m.BrakeSystem(50);
    }
}
