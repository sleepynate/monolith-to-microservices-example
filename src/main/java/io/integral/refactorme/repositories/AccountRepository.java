package io.integral.refactorme.repositories;

import io.integral.refactorme.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
