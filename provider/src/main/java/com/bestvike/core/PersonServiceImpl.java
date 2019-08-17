package com.bestvike.core;

import com.alibaba.dubbo.config.annotation.Service;
import com.bestvike.PersonService;
import com.bestvike.entity.Person;
import org.springframework.stereotype.Component;

@Service(interfaceClass = PersonService.class)
@Component
public class PersonServiceImpl implements PersonService {
    @Override
    public String findOnePersonJson() {
        return new Person("张三","1844541388","山东省青岛市海尔路").toString();

    }
}
