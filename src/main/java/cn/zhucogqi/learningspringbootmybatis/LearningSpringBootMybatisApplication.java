package cn.zhucogqi.learningspringbootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.zhucogqi.learningspringbootmybatis.mapper")
public class LearningSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBootMybatisApplication.class, args);
    }

}
