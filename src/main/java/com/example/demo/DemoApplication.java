package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(@Configuration + @EnableAutoConfiguration + @ComponentScan)
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}





/*

Annotating a class with the @Configuration indicates that the class may be used by JavaConfig as a source of bean
definitions. The simplest possible @Configuration class would read as follows:
@Configuration
public class ApplicationConfig {
}

An application may make use of just one @Configuration-annotated class, or many. @Configuration can be considered
the equivalent of XML's <beans/> element. Like <beans/>, it provides an opportunity to explicitly set defaults
for all enclosed bean definitions.
@Configuration(defaultAutowire = Autowire.BY_TYPE, defaultLazy = Lazy.FALSE)
public class ApplicationConfig {
    // bean definitions follow
}

Because the semantics of the attributes to the @Configuration annotation are 1:1 with the attributes to the
<beans/> element, this documentation defers to the beans-definition section of Chapter 3, IoC from the Core
Spring documentation. See also the Javadoc for @Configuration for details on each of the available annotation
attributes.


@EnableAutoConfiguration
annotation tells Spring Boot to "guess" how you will want to configure Spring, based on the jar dependencies
that you have added. For example, If HSQLDB is on your classpath, and you have not manually configured any
database connection beans, then Spring will auto-configure an in-memory database.

automatically configures the Spring application based on its included jar files, it sets up defaults or helper
based on dependencies in pom.xml. Auto-configuration is usually applied based on the classpath and the defined
beans. Therefore, we donot need to define any of the DataSource, EntityManagerFactory, TransactionManager etc
and magically based on the classpath, Spring Boot automatically creates proper beans and registers them for us.
For example when there is a tomcat-embedded.jar on your classpath you likely need a TomcatEmbeddedServletContainerFactory
(unless you have defined your own EmbeddedServletContainerFactory bean). @EnableAutoConfiguration has a exclude
attribute to disable an auto-configuration explicitly otherwise we can simply exclude it from the pom.xml, for
example if we donot want Spring to configure the tomcat then exclude spring-bootstarter-tomcat from
spring-boot-starter-web.



@ComponentScan
tells Spring to look for other components, configurations, and services in the specified package. Spring is
able to auto scan, detect and register your beans or components from pre-defined project package. If no package
is specified current class package is taken as the root package.


provides scope for spring component scan, it simply goes though the provided base package and picks up dependencies
required by @Bean or @Autowired etc, In a typical Spring application, @ComponentScan is used in a configuration
classes, the ones annotated with @Configuration. Configuration classes contains methods annotated with @Bean.
These @Bean annotated methods generate beans managed by Spring container. Those beans will be auto-detected by
@ComponentScan annotation. There are some annotations which make beans auto-detectable like @Repository , @Service,
@Controller, @Configuration, @Component. In below code Spring starts scanning from the package including BeanA
class.

@Configuration
@ComponentScan(basePackageClasses = BeanA.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Config {

  @Bean
  public BeanA beanA(){
    return new BeanA();
  }

  @Bean
  public BeanB beanB{
    return new BeanB();
  }

}
*/


