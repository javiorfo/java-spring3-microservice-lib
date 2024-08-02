package com.javi.auditory.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MongoAuditable {
    private static final String DATE_FORMAT = "dd-MM-yyyy hh:mm:ss";

    @CreatedDate
    @DateTimeFormat(pattern = DATE_FORMAT)
    protected LocalDateTime createDate;

    @LastModifiedDate
    @DateTimeFormat(pattern = DATE_FORMAT)
    protected LocalDateTime lastModified;

    @CreatedBy
    protected String createdBy;

    @LastModifiedBy
    protected String lastModifiedBy;
}
