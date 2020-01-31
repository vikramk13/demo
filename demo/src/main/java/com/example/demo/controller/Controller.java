package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TicketDao;
import com.example.demo.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class Controller {
	
	@Autowired
	private TicketDao ticketDao;
	
	
	@PostMapping("/booktickets")
	public List<Ticket>  bookTickets(@RequestBody List<Ticket> tickets)
	{
		return (List<Ticket>) ticketDao.saveAll(tickets);
		
		
	}
	//adding
	@GetMapping("/gettickets")
	public List<Ticket> getTickets(@RequestBody List<Ticket> tickets)
	{
		
		return (List<Ticket>) ticketDao.findAll();
	
		
	}
	
	
	
	

}
