package com.example.demo.jpql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    @Column(columnDefinition = "TIMESTAMP NOT NULL " + "DEFAULT CURRENT_TIMESTAMP", updatable = false, insertable = false)
    private LocalDateTime insertTime;
    @OneToMany(mappedBy = "address")
    private List<UserAddress> userAddresses;
    public Address(String detail)  {
        this.detail = detail;
    }
}
