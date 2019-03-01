package com.lhl.jpa.controller;

import com.lhl.jpa.bean.TestBean;
import com.lhl.jpa.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihongli on 2019/3/1
 */
@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        TestBean testBean = new TestBean();
        testBean.setName("嘻嘻嘻嘻嘻");
        try {
            testRepository.save(testBean);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }
}
