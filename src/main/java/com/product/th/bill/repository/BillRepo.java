package com.product.th.bill.repository;

import com.product.th.bill.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepo extends JpaRepository<Bill, Integer> {

    List<Bill> findAllByOrderByIdAsc();
}
