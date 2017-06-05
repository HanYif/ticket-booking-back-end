package com.teamid.dao;

import com.teamid.entity.Ticket;

import java.util.List;

/**
 * Created by Skye on 2017/6/3.
 */
public interface TicketDAO {

    void modifyTicketStatusById(long ticketTd, int status);

    List<Ticket> findTicketsByScheduleId(long scheduleId);

    Ticket findTicketById(long ticketId);

    void modifyTicketMessageById(long ticketTd, int status);
}
