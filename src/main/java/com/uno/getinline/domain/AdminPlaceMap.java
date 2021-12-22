package com.uno.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {

    private Long id;

    private Long admin_id;

    private Long place_id;

    private LocalDateTime createdAt;

    private LocalDateTime modified;
}
