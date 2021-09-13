package dev.schoolmanagement.service;

import dev.schoolmanagement.entity.SalaryUpdateLog;

import java.time.LocalDate;

public interface SalaryUpdateLogService extends LogService <SalaryUpdateLog> {
    SalaryUpdateLog findByInstructorAndDate(Long instructorId, LocalDate createdDate);
}
