package com.example.dbauth.repository;

import com.example.dbauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserDetailsRepository  extends JpaRepository<User,Integer> {
    public User findByUserName(String name);
}
