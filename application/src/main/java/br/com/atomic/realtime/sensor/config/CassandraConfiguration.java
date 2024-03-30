package br.com.atomic.realtime.sensor.config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.security.NoSuchAlgorithmException;

import static com.datastax.oss.driver.api.core.config.DriverConfigLoader.*;

@Configuration
@RequiredArgsConstructor
public class CassandraConfiguration {

    private final AppProperties appProperties;
    File driverConfig = new File(System.getProperty("user.dir") + "/application/src/main/resources/application.conf");

    @Primary
    @Bean
    public CqlSession session() throws NoSuchAlgorithmException {
        return CqlSession.builder().
                withConfigLoader(fromFile(driverConfig)).
                withAuthCredentials(appProperties.getUsername(), appProperties.getPassword()).
                withSslContext(SSLContext.getDefault()).
                withKeyspace(appProperties.getKeyspaceName()).
                build();
    }
}
