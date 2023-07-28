package com.lunchbox.lunchboxdonation.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AutoCloseable.class)
public class Timestamp {

    @CreatedDate
    private LocalDate createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

}
