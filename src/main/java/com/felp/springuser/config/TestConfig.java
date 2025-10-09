package com.felp.springuser.config;

import com.felp.springuser.entities.Order;
import com.felp.springuser.entities.User;
import com.felp.springuser.entities.enums.OrderStatus;
import com.felp.springuser.repositories.OrderRepository;
import com.felp.springuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User u3 = new User(null, "Bob Grey", "bob@gmail.com", "966666666", "123456");
        User u4 = new User(null, "Anna White", "anna@gmail.com", "955555555", "123456");
        User u5 = new User(null, "James Black", "james@gmail.com", "944444444", "123456");
        User u6 = new User(null, "Laura Blue", "laura@gmail.com", "933333333", "123456");
        User u7 = new User(null, "Peter Yellow", "peter@gmail.com", "922222222", "123456");
        User u8 = new User(null, "Susan Red", "susan@gmail.com", "911111111", "123456");
        User u9 = new User(null, "Tom Orange", "tom@gmail.com", "900000000", "123456");
        User u10 = new User(null, "Linda Purple", "linda@gmail.com", "999999999", "123456");


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
