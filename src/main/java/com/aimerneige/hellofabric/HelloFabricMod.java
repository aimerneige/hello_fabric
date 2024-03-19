package com.aimerneige.hellofabric;

import com.aimerneige.hellofabric.block.ModBlocks;
import com.aimerneige.hellofabric.item.ModItemGroups;
import com.aimerneige.hellofabric.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloFabricMod implements ModInitializer {
    public static final String MOD_ID = "hellofabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}
