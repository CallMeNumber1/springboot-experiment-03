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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 25)
    private String name;
    @Column(columnDefinition = "TIMESTAMP NOT NULL " + "DEFAULT CURRENT_TIMESTAMP", updatable = false, insertable = false)
    private LocalDateTime insertTime;
    @OneToMany(mappedBy = "user")
    private List<UserAddress> userAddresses;
    public User(String name) {
        this.name = name;
    }
}
