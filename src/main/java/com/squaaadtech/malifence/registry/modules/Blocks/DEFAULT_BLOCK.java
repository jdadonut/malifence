package com.squaaadtech.malifence.registry.modules.Blocks;

import com.squaaadtech.malifence.Malifence;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class DEFAULT_BLOCK {

    public static final Block BLOCK_NAME = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES, 4)
            //Mining Level:
            //  0: Wood
            //  1: Stone/Gold
            //  2: Iron
            //  3: Diamond
            //  4: Netherite
            .requiresTool()
    );
    public static void DoRegister(){
        Registry.register(Registry.BLOCK, new Identifier(Malifence.MOD_ID, "block_name"), BLOCK_NAME);
    }
}
