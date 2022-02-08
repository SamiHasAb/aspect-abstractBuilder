package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="demo")  // it will scan all beans under demo package
@EnableAspectJAutoProxy
public class BeanConfig {

}
