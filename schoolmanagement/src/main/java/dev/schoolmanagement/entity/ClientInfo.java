package dev.schoolmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SessionScope
public class ClientInfo extends AbstractEntity{
    private String clientIp;
    private String clientURL;
    private String clientSessionId;
    @OneToOne(fetch = FetchType.LAZY)
    private SalaryUpdateLog salaryUpdateLog;
}
