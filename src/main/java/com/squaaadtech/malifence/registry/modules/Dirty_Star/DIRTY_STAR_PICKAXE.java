package com.squaaadtech.malifence.registry.modules.Dirty_Star;

import com.squaaadtech.malifence.Malifence;
import com.squaaadtech.malifence.registry.modules.TOOLS.Pickaxe;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIRTY_STAR_PICKAXE {
    public static final Pickaxe DIRTY_STAR_PICKAXE = new Pickaxe(new DIRTY_STAR(), 5, 2, new Item.Settings()
    .fireproof()
    .maxCount(1)
    );

    public static void doRegister(){
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "dirty_star_pickaxe"), DIRTY_STAR_PICKAXE);
    }
}
