package ru.job4j.poly;

public class TransportPark {
    public static void main(String[] args) {
        Vehicle tr = new Train();
        Vehicle ap = new Airplane();
        Vehicle b = new Bus();
        Vehicle[] veh = new Vehicle[3];
        veh[0] = tr;
        veh[1] = ap;
        veh[2] = b;
        for (int i = 0; i < veh.length; i++) {
            System.out.println(veh[i].getName());
            veh[i].move();
        }
    }
}
