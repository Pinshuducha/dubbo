package com.bestvike.code;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bestvike.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Reference
    PersonService personService;

    @GetMapping("/find/getPerson")
    public String getPerson() {
        return personService.findOnePersonJson();
    }
}
