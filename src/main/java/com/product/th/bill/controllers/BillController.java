package com.product.th.bill.controllers;

import com.product.th.bill.entities.Bill;
import com.product.th.bill.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/")
    public ResponseEntity getBillAll() {
        List<Bill> result = billService.getBillAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity getBillAll(@PathVariable int id) {
        List<Bill> result = billService.getBillAll();
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBillById(@PathVariable int id) {
        billService.deleteBillById(id);
        return ResponseEntity.ok(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateBill(@PathVariable int id, @RequestBody Bill bill) {
        bill.setId(id);
        bill = billService.save(bill);
        return ResponseEntity.ok(bill);
    }

    @PostMapping("/")
    public ResponseEntity createBill(@RequestBody Bill bill) {
        bill = billService.save(bill);
        return ResponseEntity.ok(bill);
    }
}
