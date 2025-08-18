package com.example.config;
import com.example.app.Alien;
import com.example.app.Computer;
import  com.example.app.Desktop;
import com.example.app.Laptop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.app")
public class Appconfig {
  
//     // @Bean(name ={ "desk", "desk1"})
//     @Bean
//     @Scope("prototype")
//   public Desktop desktop(){
//        return new Desktop();
//   }
//       @Bean
//     @Scope("prototype")
//     @Primary
//   public Laptop laptop(){
//        return new Laptop();
//   }
 
// //   @Bean
// //   public Alien alien( @Qualifier("laptop") Computer comp){
// //     Alien obj = new Alien();
// //     obj.setComp(comp);
// //     return obj;
// //   }
//   @Bean
//   public Alien alien( Computer comp){
//     Alien obj = new Alien();
//     obj.setComp(comp);
//     return obj;
//   }
}
