package com.example.calendar.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    private int id;
    private String title;
    private String body;
}
