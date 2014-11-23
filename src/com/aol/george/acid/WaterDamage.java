package com.aol.george.acid;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;


public class WaterDamage implements Listener{

//Need to add a repeating task to check if the player is within the water every 0.5 secs

@EventHandler
public void onPlayerMove(PlayerMoveEvent evt) {
    Material m = evt.getPlayer().getLocation().getBlock().getType();
    if (m == Material.STATIONARY_WATER || m == Material.WATER) {
        //Kill them with sadistic ways of torture :)
    }
}
}