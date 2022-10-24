package com.template.common.domain;

import java.time.LocalDateTime;
import javax.persistence.*;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @CreatedDate
  @Column(updatable = false)
  private LocalDateTime createdAt;

  @LastModifiedDate
  private LocalDateTime updatedAt;

}
