package dev.schoolmanagement.configuration;

import dev.schoolmanagement.entity.ClientInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
@AllArgsConstructor
@NoArgsConstructor
public class ClientInfoInterceptor implements HandlerInterceptor, WebMvcConfigurer {
    @Autowired
    private ClientInfo clientInfo;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        clientInfo.setClientIp(request.getRemoteHost());
        clientInfo.setClientSessionId(request.getRequestedSessionId());
        clientInfo.setClientURL(request.getRequestURI());
        return true;
    }
    @Bean
    ClientInfo clientRequestDTO(){
        return new ClientInfo();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this).addPathPatterns("/**");
    }
}
