package com.example.model;

import java.util.Date;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer")
@Entity
public class CustomerEntity  implements Serializable {

    @GeneratedValue( generator = "uuid2" )
    @GenericGenerator( name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator" )
    @Column( name = "id", columnDefinition = "VARCHAR(36)" )
	@Id
    private String id;

    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
}
