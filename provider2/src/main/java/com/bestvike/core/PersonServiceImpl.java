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
        return new Person("李四","15875641234","山东省济南市经十路").toString();

    }
}
