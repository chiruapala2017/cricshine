package org.chiranjib.sbpractice.cricshine.service.impl;

import java.util.List;

import org.chiranjib.sbpractice.cricshine.model.Player;
import org.chiranjib.sbpractice.cricshine.repository.CricshineRepository;
import org.chiranjib.sbpractice.cricshine.service.CricshineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*This class is for getting all
 *  crocketer values*/
@Service
public class cricshineServiceImpl implements CricshineService{
	
	@Autowired
	private CricshineRepository cricshineRepository; 
	
	@Override
	public List<Player> retrieveAllCricketers() {
		// TODO Auto-generated method stub
		
		System.out.println("Git new branch added into project");
		return cricshineRepository.retrieveAllCricketers();
	}

}
