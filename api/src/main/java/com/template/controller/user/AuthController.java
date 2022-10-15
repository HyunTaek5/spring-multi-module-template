package com.template.controller.user;

import com.template.persistence.user.AuthService;
import com.template.persistence.user.dto.LoginDto;
import com.template.persistence.user.dto.LoginDto.LoginRes;
import com.template.persistence.user.dto.UserDto.UserReq;
import com.template.persistence.user.dto.UserDto.UserRes;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  @PostMapping(value = "/signup")
  public ResponseEntity<UserRes> signUp (
      @RequestBody UserReq userReq
  ) {
    return new ResponseEntity<>(authService.create(userReq), HttpStatus.CREATED);
  }

  // 로그인
  @PostMapping("/login")
  public ResponseEntity<LoginRes> logIn(
      @Valid @RequestBody LoginDto.LoginReq loginDto
  ) {
    return new ResponseEntity<>(authService.login(loginDto), HttpStatus.OK);
  }



}
