package com.teamid.utils;

import com.teamid.entity.Schedule;
import com.teamid.entity.Ticket;
import com.teamid.service.ScheduleService;
import com.teamid.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * Created by 伟宸 on 2017/6/4.
 */
public class TicketUtils {

    @Autowired
    static TicketService ticketService;

    @Autowired
    static ScheduleService scheduleService;

    public static boolean checkPartnerTicketExpired(long ticketId) {

        return checkTicket1hExpired(ticketId);

    }

    public static boolean checkTicketExpired(long ticketId) {

        Ticket ticket = ticketService.getTicketById(ticketId);
        long scheduleId = ticket.getScheduleId();
        Schedule schedule = scheduleService.findScheduleByScheduleId(scheduleId).get();
        long gap = LocalDateTimeUtils.getDifference(LocalDateTime.now(), schedule.getStartTime());

        return gap <= 0;

    }

    public static boolean checkTicket1hExpired(long ticketId) {

        Ticket ticket = ticketService.getTicketById(ticketId);
        long scheduleId = ticket.getScheduleId();
        Schedule schedule = scheduleService.findScheduleByScheduleId(scheduleId).get();
        long gap = LocalDateTimeUtils.getDifference(LocalDateTime.now(), schedule.getStartTime());

        return gap <= 60;

    }

}
