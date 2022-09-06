package ru.job4j.poly;

public class Bus implements Transport {
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
}
