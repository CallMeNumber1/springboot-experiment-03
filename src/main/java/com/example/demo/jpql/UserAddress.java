package com.example.demo.jpql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "TIMESTAMP NOT NULL " + "DEFAULT CURRENT_TIMESTAMP", updatable = false, insertable = false)
    private LocalDateTime insertTime;
    @ManyToOne
    private User user;
    @ManyToOne
    private Address address;
    public UserAddress(User user, Address address) {
        this.user = user;
        this.address = address;
    }
}
