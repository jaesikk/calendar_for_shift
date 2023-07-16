package com.example.calendar.repository;

import com.example.calendar.vo.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarRepository {

    public List<Schedule> getSchedules();

    public Schedule getSchedule(int id);

    public void writeSchedule(String title, String body);

    public void deleteSchedule(int id);

    public void modifySchedule(int id, String title, String body);

    public int getLastInsertId();
}
