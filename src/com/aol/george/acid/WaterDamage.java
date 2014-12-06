package com.aol.george.acid;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scheduler.BukkitRunnable;



public class WaterDamage implements Listener{
	
	Main m;
	
	public WaterDamage(Main m){
		this.m = m;
	}

//Need to add a repeating task to check if the player is within the water every 0.5 secs

@EventHandler
	public void onPlayerMove(PlayerMoveEvent evt) {
		final Player player = evt.getPlayer();
		Material m = player.getLocation().getBlock().getType();
		
		if (m == Material.STATIONARY_WATER || m == Material.WATER) {
			Bukkit.getScheduler().scheduleSyncRepeatingTask(this.m, new BukkitRunnable(){

				public void run() {
					if(player.getLocation().getBlock().getType() == Material.WATER || player.getLocation().getBlock().getType() == Material.STATIONARY_WATER){
						player.damage(2);
					}
					else{
						this.cancel();
					}
				}
				
			}, 0, 10);	
    	}
	}
}