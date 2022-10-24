package com.template.persistence.user.entity;

import com.template.common.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column(name = "role")
    Role role;

    @Column(length = 30)
    private String name;

    @Column(length = 30, unique = true, nullable = false)
    private String username;

    @Embedded
    private Password password;

    @Column(length = 13)
    private String phoneNumber;

    @Column()
    private String email;

    @Column()
    private String address;
}
