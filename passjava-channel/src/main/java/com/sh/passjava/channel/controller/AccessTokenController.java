package com.sh.passjava.channel.controller;

import com.sh.common.utils.PageUtils;
import com.sh.common.utils.R;
import com.sh.passjava.channel.entity.AccessTokenEntity;
import com.sh.passjava.channel.service.AccessTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 渠道-认证表
 *
 * @author sunhu
 * @email
 * @date 2020-12-25 10:56:45
 */
@RestController
@RequestMapping("channel/accesstoken")
public class AccessTokenController {
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = accessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        AccessTokenEntity accessToken = accessTokenService.getById(id);

        return R.ok().put("accessToken", accessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AccessTokenEntity accessToken) {
        accessTokenService.save(accessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AccessTokenEntity accessToken) {
        accessTokenService.updateById(accessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        accessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
