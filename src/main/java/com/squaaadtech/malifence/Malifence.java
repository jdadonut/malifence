package com.squaaadtech.malifence;

import com.squaaadtech.malifence.registry.modules.MainRegisterManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

public class Malifence implements ModInitializer {

    public static final String MOD_ID = "malifence";


    @Override
    public void onInitialize() {
        MainRegisterManager.RegisterAll();
        Malifence.setupBedrockBypass();

    }
    private static void setupBedrockBypass(){
        PlayerBlockBreakEvents.AFTER.register((world, playerEntity, blockPos, blockState, blockEntity) -> {
            if (blockState.getBlock() == Blocks.BEDROCK && !playerEntity.isCreative()) {
                Block.dropStack(world, blockPos, new ItemStack(Items.BEDROCK));
            }
        });
    }
}
