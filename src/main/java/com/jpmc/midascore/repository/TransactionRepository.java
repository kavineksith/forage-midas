package com.jpmc.midascore.repository;

import com.jpmc.midascore.entity.TransactionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link TransactionRecord}.
 *
 * No custom queries are needed for Task 3 — save() from JpaRepository is sufficient.
 * Additional finder methods can be added in later tasks without touching this interface.
 */
@Repository
public interface TransactionRepository extends JpaRepository<TransactionRecord, Long> {
}
