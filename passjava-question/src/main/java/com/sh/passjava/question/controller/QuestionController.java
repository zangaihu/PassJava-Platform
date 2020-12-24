package com.sh.passjava.question.controller;

import com.sh.common.utils.PageUtils;
import com.sh.common.utils.R;
import com.sh.passjava.question.entity.QuestionEntity;
import com.sh.passjava.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author sunhu
 * @email
 * @date 2020-12-24 10:52:12
 */
@RestController
@RequestMapping("question/question" )
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    /**
     * 列表
     */
    @RequestMapping("/list" )
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = questionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}" )
    public R info(@PathVariable("id" ) Long id) {
        QuestionEntity question = questionService.getById(id);

        return R.ok().put("question", question);
    }

    /**
     * 保存
     */
    @RequestMapping("/save" )
    public R save(@RequestBody QuestionEntity question) {
        questionService.save(question);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update" )
    public R update(@RequestBody QuestionEntity question) {
        questionService.updateById(question);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete" )
    public R delete(@RequestBody Long[] ids) {
        questionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
