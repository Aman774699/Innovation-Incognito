package com.hackthon.innovationIncognito.repository;

import com.hackthon.innovationIncognito.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserRepositary extends JpaRepository<User, Integer> {
    @Query("SELECT U FROM User U WHERE U.email= :email")
    public  User getUserByEmail(@Param("email") String email);
    }
