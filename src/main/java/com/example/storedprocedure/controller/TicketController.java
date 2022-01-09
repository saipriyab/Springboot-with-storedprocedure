package com.example.storedprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.storedprocedure.dao.TicketDao;
import com.example.storedprocedure.model.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketDao ticketDao;

	@GetMapping("/findTicket")
	public List<Ticket> findTicket() {
		return ticketDao.getTicketInfo();
	}
	
	@GetMapping("/findTicketByCategory/{category}")
	public List<Ticket> findTicketByCategory(@PathVariable String category) {
		return ticketDao.getTicketByCategory(category);
	}

}
