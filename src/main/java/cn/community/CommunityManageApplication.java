package cn.community;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("cn.community.mapper")
public class CommunityManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityManageApplication.class, args);
    }

}
