package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderService {
    boolean order(User user, LocalDateTime orderCreateDatetime) ;
}
