package com.xd.shardingtable;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xd.shardingtable.mapper")
public class SpringbootShardingTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShardingTableApplication.class, args);
	}

}
