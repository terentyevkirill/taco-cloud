package com.terentiev.tacocloud.data;

import com.terentiev.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
