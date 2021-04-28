package com.springcloud.service.serviceImpl;

import com.springcloud.dao.PaymentDao;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int insert(Payment payment){
        return paymentDao.insert(payment);
    }

    public Payment select(@Param("id")long id){
        return paymentDao.select(id);
    }
}
