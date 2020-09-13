package com.product.th.bill.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BILL")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String title;

    private Double amount;

    @Column(length = 2000)
    private String description;

    private Date createdAt;
    private Date updatedAt;
}
