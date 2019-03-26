package com.example.demo.jpql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
    @Query("SELECT ua FROM UserAddress ua where ua.user.name=:name and ua.address.detail=:detail")
   UserAddress find(@Param("name") String name, @Param("detail") String detail);
}
