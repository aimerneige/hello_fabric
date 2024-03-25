package com.aimerneige.hellofabric.item;

import com.aimerneige.hellofabric.HelloFabricMod;
import com.aimerneige.hellofabric.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(HelloFabricMod.MOD_ID, "ruby"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY);
                entries.add(ModItems.METAL_DETECTOR);
                entries.add(ModItems.TOMATO);

                entries.add(ModBlocks.RUBY_BLOCK);
                entries.add(ModBlocks.RAW_RUBY_BLOCK);
                entries.add(ModBlocks.RUBY_ORE);
                entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                entries.add(ModBlocks.NETHER_RUBY_ORE);
                entries.add(ModBlocks.END_STONE_RUBY_ORE);
                entries.add(ModBlocks.SOUND_BLOCK);
            }).build());

    public static void registerItemGroups() {
        HelloFabricMod.LOGGER.info("Registering Item Groups for " + HelloFabricMod.MOD_ID);
    }
}
