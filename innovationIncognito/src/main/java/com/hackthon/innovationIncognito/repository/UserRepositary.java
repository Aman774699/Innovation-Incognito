package com.hackthon.innovationIncognito.repository;

import com.hackthon.innovationIncognito.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepositary extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    User getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
