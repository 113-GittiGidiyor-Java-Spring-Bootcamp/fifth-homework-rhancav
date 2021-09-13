package dev.schoolmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.context.annotation.SessionScope;

import javax.persistence.Embeddable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SessionScope
@Embeddable
public class ClientInfo {
    private String clientIp;
    private String clientURL;
    private String clientSessionId;
}
