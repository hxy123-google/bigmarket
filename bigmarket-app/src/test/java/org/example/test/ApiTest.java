package org.example.test;

import lombok.extern.slf4j.Slf4j;
import org.example.infrastructure.persistent.redis.IRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RMap;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {
   @Resource
   private IRedisService redisService;
   @Test
    public void test() {
        RMap<Object,Object> map= redisService.getMap("strategy_id_100003");
        map.put(1,101);
        map.put(2,101);
        map.put(3,101);
        map.put(4,102);
        map.put(5,102);
        map.put(6,102);
        map.put(7,103);
        map.put(8,103);
        map.put(9,104);
        map.put(10,105);
        log.info("测试完成:{}",redisService.getFromMap("strategy_id_100003",1).toString());
    }
    @Test
    public  void test1(){

            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            // 使用 filter 方法筛选出所有偶数
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println(evenNumbers); // 输出: [2, 4, 6, 8, 10]


    }

}
