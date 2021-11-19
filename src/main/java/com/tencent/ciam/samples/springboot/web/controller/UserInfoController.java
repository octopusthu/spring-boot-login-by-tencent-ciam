package com.tencent.ciam.samples.springboot.web.controller;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author figozhang
 */
@RestController
public class UserInfoController {

    @GetMapping("/userinfo")
    Principal userinfo(Principal principal) {
        return principal;
    }
}
