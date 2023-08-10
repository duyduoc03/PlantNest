package com.example.plantnest.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "Orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_Id")
    private int orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_Id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Plant_Id", nullable = false)
    private Plant plant;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @Temporal(TemporalType.DATE)
    @Column(name = "Order_Date", nullable = false)
    private Date orderDate;

    @Column(name = "Total_Amount", nullable = false)
    private BigDecimal totalAmount;
}
