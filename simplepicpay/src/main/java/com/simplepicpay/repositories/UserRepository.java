package com.simplepicpay.repositories;

import com.simplepicpay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserByDocument(String document);
}
