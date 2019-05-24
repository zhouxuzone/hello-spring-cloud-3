package com.zhouyn.demo.servicegeteway;

//import com.zhouyn.demo.servicegeteway.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ServiceGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGetewayApplication.class, args);
    }

//    @Bean
//    public TokenFilter tokenFilter() {
//        return new TokenFilter();
//    }

}
