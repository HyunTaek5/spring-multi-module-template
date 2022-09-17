package com.template.controller.user;

import com.template.persistence.user.UserService;
import com.template.persistence.user.dto.UserInfoDto;
import com.template.persistence.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/info")
    public ResponseEntity<UserInfoDto> test (
        @CurrentUser final User user
    ) {
        return new ResponseEntity<>(new UserInfoDto(user), HttpStatus.OK);
    }
}
