import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());
        HelloWorld beanHello2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello2.getMessage());
        Cat beanCat1 = (Cat) applicationContext.getBean("catworld");
        System.out.println(beanCat1.getCats());
        Cat beanCat2 = (Cat) applicationContext.getBean("catworld");
        System.out.println(beanCat2.getCats());

        //Сравнили бины т.к. они синглтоны они равны
        System.out.println(beanHello1 == beanHello2);
        //Сравнили бины т.к. они прототайпы они не равны ссылки у них разные
        System.out.println(beanCat1 == beanCat2);
    }
}