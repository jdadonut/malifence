package com.squaaadtech.malifence.registry.modules.Diamidian;

import com.squaaadtech.malifence.Malifence;
import com.squaaadtech.malifence.registry.modules.Diamidian.DIAMIDIAN_ARMOR;
import com.squaaadtech.malifence.registry.modules.TOOLS.Chestplate;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIAMIDIAN_CHESTPLATE {
    public static final Chestplate DIAMIDIAN_CHESTPLATE = new Chestplate(new DIAMIDIAN_ARMOR(), new Item.Settings()
            .maxCount(1)
            .fireproof()
            .group(ItemGroup.COMBAT)
    );
    public static void doRegister(){
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "diamidian_chestplate"), DIAMIDIAN_CHESTPLATE);
    }
}
