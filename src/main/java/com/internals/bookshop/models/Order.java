package com.internals.bookshop.models;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class Order {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    private String orderNum;
    private int customerId;
    private BigDecimal totalAmount;
    private BigDecimal amountPaid;
    private BigDecimal balance;
    private int  discount;
    @JsonFormat (shape = JsonFormat.Shape.STRING,pattern ="dd-mm-yyyy")
    private Date createdAt;
};
