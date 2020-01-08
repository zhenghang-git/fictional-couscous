package com.mr.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName EasyBuyStart
 * @Description: TODO
 * @Author zhenghang
 * @date 2019/12/19
 * @Version V1.0
        **/
@SpringBootApplication
@MapperScan(value = "com.mr.zh.mapper")
public class EasyBuyStart {
    public static void main(String[] args) {
        SpringApplication.run(EasyBuyStart.class);
    }
}
