package br.com.atomic.realtime.sensor.domain;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;

@Table("sensor_temperature_table")
public class MosquittoTemperatureSensorDTO {

    @PrimaryKeyColumn(name = "uuid", type = PrimaryKeyType.PARTITIONED)
    private String uuid;

    @PrimaryKeyColumn(name = "cliente", type = PrimaryKeyType.PARTITIONED)
    private String cliente;

    @Column("microsegundos")
    private long microsegundos;

    @Column("dataAtual")
    private LocalDateTime dataAtual;

    @Column("timestamp")
    private String timestamp;

    @Column("celcius")
    private float celcius;

    @Column("fahrenheit")
    private float fahrenheit;

    @Column("kelvin")
    private float kelvin;
}
