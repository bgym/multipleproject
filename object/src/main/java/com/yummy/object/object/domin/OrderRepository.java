package com.yummy.object.object.domin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderRepository extends JpaRepository<Order, String> ,JpaSpecificationExecutor<Order> {

}
