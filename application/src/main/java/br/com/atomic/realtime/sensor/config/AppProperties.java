package br.com.atomic.realtime.sensor.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring.data.cassandra")
public class AppProperties {
    private String contactPoints;
    private String keyspaceName;
    private String table;
    private int port;
    private String username;
    private String password;
}

