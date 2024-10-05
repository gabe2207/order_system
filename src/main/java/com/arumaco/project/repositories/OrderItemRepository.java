package com.arumaco.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arumaco.project.entities.OrderItem;
import com.arumaco.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
