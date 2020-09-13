package com.product.th.bill.services;

import com.product.th.bill.entities.Bill;
import com.product.th.bill.repository.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepo billRepo;

    public List<Bill> getBillAll() {
        return billRepo.findAllByOrderByIdAsc();
    }

    public Bill getBillById(int id) {
        return billRepo.findById(id).get();
    }

    public void deleteBillById(int id) {
        billRepo.deleteById(id);
    }

    public Bill save(Bill bill) {
        return billRepo.save(bill);
    }
}
