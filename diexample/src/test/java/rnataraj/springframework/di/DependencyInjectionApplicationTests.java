package rnataraj.springframework.di;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import springboot.DependencyInjectionApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DependencyInjectionApplication.class)
@WebAppConfiguration
class DependencyInjectionApplicationTests {

    @Test
    void contextLoads() {
    }

}
