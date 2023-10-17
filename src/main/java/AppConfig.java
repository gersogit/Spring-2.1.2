import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    //Устанавливаем аннатацию @Scope указываем что prototype,
    //обычно singlton установлен по умолчанию
    @Bean(name = "catworld")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setCats("Саламалейкум cat");
        return cat;
    }
}