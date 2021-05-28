package com.example.demo;

import com.example.demo.config.ABCConfig;
import com.example.demo.entity.Car;
import com.example.demo.entity.Country;
import com.example.demo.entity.SomeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//    @Autowired
//    private BeanA beanA;//@Scope("singleton")可以讓她唯一的實例
//
//    @Autowired
//    private BeanA beanAA;//@Scope("prototype")可以每次創建新的實例

//    @Test
//    public void contextLoads() {
//        System.out.println(beanA.getName());
//    }

    @Test
    public void testAnnotationConfig5() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ABCConfig.class);
        System.out.println("IOC容器創建完成");
//		BeanA person = (BeanA) context.getBean("BeanA");
//		System.out.println(person.getName());
    }

    @Test
    public void testBeansConfig() {
        System.out.println("開始");
        ClassPathXmlApplicationContext country=new ClassPathXmlApplicationContext("trxml.xml");
        Country CountryBean=(Country)country.getBean("country");
        String name = CountryBean.getName();
        System.out.println("Country name: " +name);
        long population = CountryBean.getPopulation();
        System.out.println("Country population: "+population);
        CountryBean.init();
        CountryBean.destroy();
        country.close();
    }

    @Test
    public  void  testService() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("CarAbout.xml");
        Car car1 = (Car) ctx.getBean("bmwCar");
        System.out.println(car1);
        car1 = (Car) ctx.getBean("audiCar");
        System.out.println(car1);//factory-method 靜態工廠方法注入bean

        ApplicationContext cwx = new ClassPathXmlApplicationContext("CarInstanceAbout.xml");
        Car car2 = (Car) cwx.getBean("car4");
        System.out.println(car2);
        car2 = (Car) cwx.getBean("car6");
        System.out.println(car2);//實例工廠方式

        ApplicationContext cqx = new ClassPathXmlApplicationContext("beans.xml");
        SomeClass some=(SomeClass)cqx.getBean("something");
        System.out.println(some.getAccounts());
    }


}
