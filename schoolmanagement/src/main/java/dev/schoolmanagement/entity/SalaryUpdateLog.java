package dev.schoolmanagement.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import java.time.Instant;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalaryUpdateLog extends BaseLog{
    private Long instructorId;
    private Double salaryBeforeUpdate;
    private Double salaryAfterUpdate;
    private Float rate;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "salaryUpdateLog")
    private ClientInfo clientInfo;
    private Instant requestTime;
}
