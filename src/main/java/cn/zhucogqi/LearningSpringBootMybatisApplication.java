package cn.zhucogqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.zhucogqi.mapper")
public class LearningSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootMybatisApplication.class, args);
    }

}
