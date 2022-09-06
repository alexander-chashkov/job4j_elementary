package ru.job4j.poly;

public interface Transport {
    void go();
    void setCountPassengers(int countPassengers);
    double refuel(int liters);
}
