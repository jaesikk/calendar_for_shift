package com.example.calendar.service;

import com.example.calendar.repository.CalendarRepository;
import com.example.calendar.vo.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    @Autowired
    private CalendarRepository calendarRepository;

    public CalendarService(CalendarRepository calendarRepository){
        this.calendarRepository = calendarRepository;
    }

    public Schedule getSchedule(int id) {

        return calendarRepository.getSchedule(id);
    }

    public Schedule writeSchedule(String title, String body){

        return calendarRepository.writeSchedule(title, body);
    }

    public void deleteSchedule(int id) {

        calendarRepository.deleteSchedule(id);
    }

    public void modifySchedule(int id, String title, String body) {

        calendarRepository.modifySchedule(id, title, body);
    }

    public List<Schedule> getSchedules(){

        return calendarRepository.getSchedules();
    }
}
