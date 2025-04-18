package com.projetotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetotest.course.entities.OrderItem;
import com.projetotest.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
		
}
