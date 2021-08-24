package com.github.joonsauce.Blocky;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

// Initializes the mod
@Mod("blocky")
public final class Blocky {
	public static final String MODID = "examplemod";
	
	private static final Logger LOGGER = LogManager.getLogger();

	public Blocky() {
		LOGGER.debug("Converting texture packs to blocks...");
	}
}