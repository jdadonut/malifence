package com.squaaadtech.malifence.registry.modules.Diamidian;

import com.squaaadtech.malifence.Malifence;
import com.squaaadtech.malifence.registry.modules.Diamidian.DIAMIDIAN_ARMOR;
import com.squaaadtech.malifence.registry.modules.TOOLS.Chestplate;
import com.squaaadtech.malifence.registry.modules.TOOLS.Hoe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIAMIDIAN_HOE {
    public static final Hoe DIAMIDIAN_HOE = new Hoe(new DIAMIDIAN(),-5, -1.0F, new Item.Settings()
            .maxCount(1)
            .fireproof()
            .group(ItemGroup.TOOLS)
    );
    public static void doRegister(){
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "diamidian_hoe"), DIAMIDIAN_HOE);
    }
}
