package com.simplepicpay.repositories;

import com.simplepicpay.domain.user.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
