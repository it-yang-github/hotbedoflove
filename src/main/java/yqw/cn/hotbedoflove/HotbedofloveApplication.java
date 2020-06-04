package yqw.cn.hotbedoflove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yqw.cn.hotbedoflove")
public class HotbedofloveApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotbedofloveApplication.class, args);
    }

}
