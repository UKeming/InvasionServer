package com.keming.invasion.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.keming.invasion.service.IUserRankService;
import com.keming.invasion.service.impl.UserRankServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author keming
 * @since 2022-04-16
 */
@RestController
@RequestMapping("/invasion/user-rank")
public class UserRankController {
    @Resource
    UserRankServiceImpl userRankService;

    @RequestMapping("list")
    public ResponseEntity list(Page page) {
        return new ResponseEntity<IPage>(userRankService.page(page), HttpStatus.OK);
    }

}
