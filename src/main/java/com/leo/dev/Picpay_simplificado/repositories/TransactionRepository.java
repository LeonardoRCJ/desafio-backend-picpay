package com.leo.dev.Picpay_simplificado.repositories;

import com.leo.dev.Picpay_simplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
