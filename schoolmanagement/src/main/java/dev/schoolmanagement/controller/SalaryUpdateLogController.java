package dev.schoolmanagement.controller;

import dev.schoolmanagement.entity.SalaryUpdateLog;
import dev.schoolmanagement.service.SalaryUpdateLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/salary-updates")
@RequiredArgsConstructor
public class SalaryUpdateLogController {
    private final SalaryUpdateLogService salaryUpdateLogService;

    @GetMapping
    public ResponseEntity<List<SalaryUpdateLog>> findAll(){
        return ResponseEntity.ok(salaryUpdateLogService.findAll());
    }

}
