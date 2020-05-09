package ccom.newer.ye;

import ccom.newer.ye.service.RedisServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTests {
    @Autowired
    private RedisServiceImpl test;

    @Test
    void contextLoads() {
        test.addString();
        test.getString();
    }
}
