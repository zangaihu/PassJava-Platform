package com.sh.passjava.question;

import com.sh.passjava.question.entity.TypeEntity;
import com.sh.passjava.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PassjavaQuestionApplication.class)
class PassjavaQuestionApplicationTests {


    @Autowired
    TypeService typeService;

    // 创建题目类型
    @Test
    public void testCreateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic" );
        typeService.save(typeEntity);
        System.out.println("创建成功" );
    }

    @Test
    void testUpdateType() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setId(1L);
        typeEntity.setType("pyhton" );
        typeService.updateById(typeEntity);
        System.out.println("更新成功" );
    }

    @Test
    void testQuery() {
        TypeEntity byId = typeService.getById(1L);
        System.out.println(byId);
    }
}
