package com.example.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.BookStore.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User,String>{

    
}
