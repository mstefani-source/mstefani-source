package za.vita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;


@Configuration
@EnableAutoConfiguration
@EnableMBeanExport
@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        // int [][] arr = {{1,5}, {4,2}};

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i][i]);
        // }
    }
}
