package org.chiranjib.sbpractice.cricshine.controller;

import java.util.List;

import org.chiranjib.sbpractice.cricshine.model.Player;
import org.chiranjib.sbpractice.cricshine.service.CricshineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricshineController {
	
	@Autowired
	private CricshineService cricshineService;
	
	@GetMapping("/cricketers")
	public List<Player> retrieveAllCricketers() {
		return cricshineService.retrieveAllCricketers();  
	}
}
