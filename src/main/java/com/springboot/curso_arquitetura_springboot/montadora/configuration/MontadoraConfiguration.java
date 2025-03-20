package com.springboot.curso_arquitetura_springboot.montadora.configuration;


import com.springboot.curso_arquitetura_springboot.montadora.Motor;
import com.springboot.curso_arquitetura_springboot.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// configurando o BEAN
@Configuration
public class MontadoraConfiguration {

    @Primary // DEIXA ESTE BEAN COMO PADRÃO
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindro(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;

    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindro(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;

    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindro(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;

    }
}
