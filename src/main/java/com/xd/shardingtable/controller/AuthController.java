package com.xd.shardingtable.controller;

import com.xd.shardingtable.service.IUserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dokit
 * @Date: 2019/8/21 18:34
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "功能-授权登录", value = "授权登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AuthController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IUserService userService;

    @Autowired
    private ApplicationEventPublisher eventPublisher;
}
