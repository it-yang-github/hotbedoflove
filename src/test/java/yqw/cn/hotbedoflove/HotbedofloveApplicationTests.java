package yqw.cn.hotbedoflove;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HotbedofloveApplicationTests {
   @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name","张山");
    }

    @Test
    void get() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        System.out.println(valueOperations.get("name"));
    }

}
