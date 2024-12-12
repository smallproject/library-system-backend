package nl.smallproject.www.librarysystembackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@SpringBootTest(classes = LibrarySystemBackendApplicationTests.class)
@org.springframework.context.annotation.ComponentScan(basePackages = "nl.smallproject.www.librarysystembackend") // Replace with your actual package name
class LibrarySystemBackendApplicationTests {

    @Test
    void contextLoads() {
    }

}
