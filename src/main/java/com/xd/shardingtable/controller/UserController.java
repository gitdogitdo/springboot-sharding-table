package com.xd.shardingtable.controller;

import com.xd.shardingtable.entity.user.vo.User;
import com.xd.shardingtable.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "系统-用户管理", value = "系统", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @PostMapping("/insert")
    @ApiOperation("注册用户")
    public Boolean insert(@Valid @RequestBody User user) {
        boolean save = false;
        try {
           save =  userService.save(user);
        }catch (Exception e){
            return save;
        }
        return save;
    }
}
