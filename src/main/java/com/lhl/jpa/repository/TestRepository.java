package com.lhl.jpa.repository;

import com.lhl.jpa.bean.TestBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lihongli on 2019/3/1
 */
public interface TestRepository extends JpaRepository<TestBean, Integer> {
}
