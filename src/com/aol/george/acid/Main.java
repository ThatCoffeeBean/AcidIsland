package com.aol.george.acid;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {



@Override
public void onEnable(){
	Bukkit.getPluginManager().registerEvents(this, this);
	Bukkit.getPluginManager().registerEvents(new WaterDamage(), this);
	
}
}