package com.squaaadtech.malifence.registry.modules.Diamidian;

import com.squaaadtech.malifence.Malifence;
import com.squaaadtech.malifence.registry.modules.TOOLS.Axe;
import com.squaaadtech.malifence.registry.modules.Diamidian.DIAMIDIAN;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DIAMIDIAN_AXE {
    public static final Axe DIAMIDIAN_AXE = new Axe(new DIAMIDIAN(), 4, -3.4F, new Item.Settings()
    .fireproof()
    .maxCount(1)
    .group(ItemGroup.TOOLS)
    );
    public static void doRegister(){
        Registry.register(Registry.ITEM, new Identifier(Malifence.MOD_ID, "diamidian_axe"), DIAMIDIAN_AXE);
    }
}
