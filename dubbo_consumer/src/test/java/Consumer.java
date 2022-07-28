import com.api.HelloDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        String name = "test";
        HelloDubboService service = (HelloDubboService) context.getBean("helloDubboService");
        for(int i = 0;i<10;i++){
            System.out.println(service.helloDubbo(name));
        }
    }
}