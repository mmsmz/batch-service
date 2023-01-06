package com.techprimers.springbatchexample1.batch;

import com.techprimers.springbatchexample1.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyCustomProcessor implements ItemProcessor<User, User>{


    @Override
    public User process(User user) throws Exception {
        System.out.println("************************************************8"+user.getName());

        return user;
    }
}
