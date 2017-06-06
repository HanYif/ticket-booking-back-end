package com.teamid.service;

import com.teamid.entity.Ticket;

import java.util.List;

/**
 * Created by Skye on 2017/6/3.
 */
public interface TicketService {

    void buyTicket(long ticketTd);

    List<Ticket> getTicketsByScheduleId(long scheduleId);

    Ticket getTicketById(long ticketId);

    void modifyTicketStatusById(long ticketTd, int status);

    void modifyTicketMessageById(long ticketTd, String message);

    boolean checkPartnerTicketExpired(long ticketId);

    boolean checkTicketExpired(long ticketId);

    boolean checkTicket1hExpired(long ticketId);
}
