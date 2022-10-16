package com.template.persistence.user.dto;

import com.template.persistence.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserInfoDto {
    private Long id;
    private String name;
    private String grade;
    private Integer point;

    public UserInfoDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

}
