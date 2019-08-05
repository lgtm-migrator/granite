package net.joeclark.webapps.granite;

import net.joeclark.webapps.granite.controller.HomeController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTest {

    @Autowired
    private HomeController homeController;


    @Test
    @DisplayName("Application context loads.")
    public void contextLoads() throws Exception {
        assertNotNull(homeController);
    }

}