package org.chiranjib.sbpractice.cricshine.repository;

import java.util.ArrayList;
import java.util.List;

import org.chiranjib.sbpractice.cricshine.model.Player;
import org.springframework.stereotype.Repository;

@Repository
public class CricshineRepository {

	public List<Player> retrieveAllCricketers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(1, "V Kohli", "India"));
		players.add(new Player(2, "Tim Paine", "Australia"));
		players.add(new Player(3, "Tamim Ikbal", "Bangladesh"));
		players.add(new Player(4, "Md Asif", "Pakistan"));
		return players;
	}

}
