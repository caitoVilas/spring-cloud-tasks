package com.reader.service;

import com.reader.entity.Order;
import com.reader.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final OrderRepository orderRepository;


    @Override
    public void createOrders(List<Order> orders) {
        orderRepository.saveAll(orders);
    }
}
