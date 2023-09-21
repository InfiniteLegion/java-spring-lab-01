package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");

        Country japan = (Country) context.getBean("japan");
        Country italy = (Country) context.getBean("italy");

        Brand nissan = (Brand) context.getBean("nissan");
        Brand ferrari = (Brand) context.getBean("ferrari");

        Car juke = (Car) context.getBean("juke");
        Car f50 = (Car) context.getBean("f50");

        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");

        System.out.println(japan);
        System.out.println(italy);
        System.out.println(nissan);
        System.out.println(ferrari);
        System.out.println(juke);
        System.out.println(f50);
        System.out.println(user1);
        System.out.println(user2);
    }
}
