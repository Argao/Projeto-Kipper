package com.eventostec.api.domain.cupon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cupon {

    @Id
    @GeneratedValue
    private UUID id;
    private Integer discount;
    private Date valid;



}
