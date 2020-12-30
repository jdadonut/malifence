package com.squaaadtech.malifence.registry.modules.Blocks;

import com.squaaadtech.malifence.Malifence;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class REINFORCED_OBSIDIAN {

    public static final Block REINFORCED_OBSIDIAN = new Block(FabricBlockSettings
            .of(Material.METAL)
                .breakByHand(false)
                .breakByTool(FabricToolTags.PICKAXES, 4)
                .requiresTool()
                );
    public static void DoRegister(){
        Registry.register(Registry.BLOCK, new Identifier(Malifence.MOD_ID, "reinforced_obsidian"), REINFORCED_OBSIDIAN);
    }
}
