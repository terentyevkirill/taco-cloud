package com.terentiev.tacocloud.data;

import com.terentiev.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);

    List<Order> findByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
}
