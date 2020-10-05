package springbootapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@EnableAutoConfiguration
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    //пустой класс, использующийся для резистрации модуля в спринг-контейнере
}