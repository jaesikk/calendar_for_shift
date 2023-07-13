package com.example.calendar.service;

import com.example.calendar.vo.Schedule;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalendarService {
    private int lastScheduleId;
    private List<Schedule> schedules;

    public CalendarService(){
        lastScheduleId = 0;
        schedules = new ArrayList<>();
    }

    public List<Schedule> schedules(){
        return schedules;
    }

    public Schedule getSchedule(int id) {
        for(Schedule schedule : schedules){
            if(schedule.getId() == id){
                return schedule;
            }
        }
        return null;
    }

    public Schedule writeSchedule(String title, String body){
        int id = lastScheduleId + 1;
        Schedule schedule = new Schedule(id, title, body);

        schedules.add(schedule);
        lastScheduleId = id;

        return schedule;
    }

    public void deleteSchedule(int id) {
        Schedule schedule = getSchedule(id);

        schedules.remove(schedule);
    }

    public void modifySchedule(int id, String title, String body) {
        Schedule schedule = getSchedule(id);

        schedule.setTitle(title);
        schedule.setBody(body);

    }
}
