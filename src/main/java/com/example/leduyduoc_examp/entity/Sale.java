package com.example.leduyduoc_examp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Sale")
public class Sale implements Serializable {

    @Id
    private int slNo;
    private int salesmanID;

    @ManyToOne
    @JoinColumn(name = "ProdID")
    @JsonIgnore
    private Product product;

    private String salesmanName;
    private Date dos;

}
