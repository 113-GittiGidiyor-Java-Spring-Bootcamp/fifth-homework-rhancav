package dev.schoolmanagement.repository;

import dev.schoolmanagement.entity.SalaryUpdateLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryUpdateLogRepository extends JpaRepository<SalaryUpdateLog, Long> {
}