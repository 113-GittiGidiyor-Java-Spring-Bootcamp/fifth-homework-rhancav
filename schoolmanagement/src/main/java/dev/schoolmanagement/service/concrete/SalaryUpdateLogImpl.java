package dev.schoolmanagement.service.concrete;

import dev.schoolmanagement.entity.SalaryUpdateLog;
import dev.schoolmanagement.repository.SalaryUpdateLogRepository;
import dev.schoolmanagement.service.SalaryUpdateLogService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
@Transactional(readOnly = true)
@NoArgsConstructor
public class SalaryUpdateLogImpl implements SalaryUpdateLogService {
    @Autowired
    SalaryUpdateLogRepository salaryUpdateLogRepository;
    @Override
    public SalaryUpdateLog save(SalaryUpdateLog salaryUpdateLog) {
        return salaryUpdateLogRepository.save(salaryUpdateLog);
    }

    @Override
    public List<SalaryUpdateLog> findAll() {
        return salaryUpdateLogRepository.findAll();
    }

    @Override
    public SalaryUpdateLog findById(long id) {
        return salaryUpdateLogRepository.findById(id).get();
    }
}
