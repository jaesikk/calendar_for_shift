package com.example.calendar.controller;

import com.example.calendar.service.CalendarService;
import com.example.calendar.vo.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UsrCalendarController {
    @Autowired
    private CalendarService calendarService;

    @RequestMapping("/usr/calendar/doAdd")
    @ResponseBody
    public Schedule doAdd(String title, String body){
        Schedule schedule = calendarService.writeSchedule(title, body);

        return schedule;
    }

    @RequestMapping("/usr/calendar/doDelete")
    @ResponseBody
    public String doDelete(int id){
        Schedule schedule = calendarService.getSchedule(id);

        if(schedule == null){
            return id + "번 스케줄은 존재하지 않습니다";
        }

        calendarService.deleteSchedule(id);

        return id + "번 스케줄은 삭제되었습니다";
    }

    @RequestMapping("/usr/calendar/doModify")
    @ResponseBody
    public String doModify(int id, String title, String body){
        Schedule schedule = calendarService.getSchedule(id);

        if (schedule == null){
            return id + "번 스케줄은 존재하지 않습니다";
        }

        calendarService.modifySchedule(id, title, body);

        return id + "번 스케줄을 수정했습니다";
    }

    @RequestMapping("/usr/calendar/detail")
    @ResponseBody
    public Object showDetail(int id){
        Schedule schedule = calendarService.getSchedule(id);

        if (schedule == null){
            return id + "번 스케줄은 존재하지 않습니다";
        }

        return schedule;
    }

    @RequestMapping("/usr/calendar/list")
    @ResponseBody
    public List<Schedule> showList(){
        return calendarService.getSchedules();
    }
}
