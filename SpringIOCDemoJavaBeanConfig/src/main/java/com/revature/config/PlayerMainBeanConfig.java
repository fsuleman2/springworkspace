package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.model.Player;

@Configuration
public class PlayerMainBeanConfig {
	@Bean("p1") //if bean name is not given default name will be method name obj name i.e firstPlayer()
	public Player firstPlayer() {
		Player player = new Player();
		player.setPlayerJerseyNo(1);
		player.setPlayerName("siraj");
		player.setTeamName("India");
		return player;
	}
	@Bean
	public Player secondPlayer() {
		return new Player(2,"Virat","India");
	}
}
