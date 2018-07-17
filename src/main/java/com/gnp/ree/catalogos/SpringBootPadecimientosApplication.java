package com.gnp.ree.catalogos;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
 
@SpringBootApplication
public class SpringBootPadecimientosApplication {
 
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(SpringBootPadecimientosApplication.class, args); 
        String[] beanNames = ctx.getBeanDefinitionNames();         
        Arrays.sort(beanNames);         
        for (String beanName : beanNames)
        {
            System.out.println("test git 2 " + beanName);
        }
    }
}