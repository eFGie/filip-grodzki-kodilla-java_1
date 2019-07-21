package com.kodilla.good.patterns.challenges.Food2Door;
import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder (Product product, int itemsCount, LocalDateTime orderCreateDateTime);
}
