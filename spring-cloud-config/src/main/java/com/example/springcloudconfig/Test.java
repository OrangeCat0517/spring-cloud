package com.example.springcloudconfig;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

public class Test {
    public static void main(String[] args) {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        config.setPassword("h3Ag!.3WT_sJZE@rWQPHM6d*");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setIvGeneratorClassName("org.jasypt.iv.RandomIvGenerator");
        config.setStringOutputType("base64");
        encryptor.setConfig(config);

        System.out.println(encryptor.encrypt("orangecat0517"));
        System.out.println(encryptor.encrypt("ft_YPdsq3EXXDpuqr3oQaqpF"));
    }

}
