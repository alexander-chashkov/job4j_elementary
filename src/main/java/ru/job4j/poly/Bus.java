package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    private int countPassengers;

    @Override
    public void go() {
        System.out.println("Поехали уееее.");
    }

    @Override
    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public double refuel(int liters) {
        return liters * 47;
    }

    @Override
    public void move() {
        System.out.println("двигается по скоростным трассам");
    }

    @Override
    public String getName() {
        return "Автобус";
    }
}
