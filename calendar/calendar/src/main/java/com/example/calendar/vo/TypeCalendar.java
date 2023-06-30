package com.example.calendar.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeCalendar {
    private long id;
    private String type_name;
    private long calendar_id;
}
