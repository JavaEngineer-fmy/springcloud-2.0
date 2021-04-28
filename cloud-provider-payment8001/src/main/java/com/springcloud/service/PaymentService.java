package com.springcloud.service;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int insert(Payment payment);

    public Payment select(@Param("id") long id);
}
