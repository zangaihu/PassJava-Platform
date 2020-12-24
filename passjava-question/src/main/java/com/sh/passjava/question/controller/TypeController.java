package com.sh.passjava.question.controller;

import com.sh.common.utils.PageUtils;
import com.sh.common.utils.R;
import com.sh.passjava.question.entity.TypeEntity;
import com.sh.passjava.question.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 题目-题目类型表
 *
 * @author sunhu
 * @email
 * @date 2020-12-24 10:52:12
 */
@RestController
@RequestMapping("question/type" )
public class TypeController {
    @Autowired
    private TypeService typeService;

    /**
     * 列表
     */
    @RequestMapping("/list" )
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = typeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}" )
    public R info(@PathVariable("id" ) Long id) {
        TypeEntity type = typeService.getById(id);

        return R.ok().put("type", type);
    }

    /**
     * 保存
     */
    @RequestMapping("/save" )
    public R save(@RequestBody TypeEntity type) {
        typeService.save(type);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update" )
    public R update(@RequestBody TypeEntity type) {
        typeService.updateById(type);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete" )
    public R delete(@RequestBody Long[] ids) {
        typeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
