package com.squaaadtech.malifence.registry.modules;

import com.squaaadtech.malifence.registry.modules.Blocks.BlockManager;
import com.squaaadtech.malifence.registry.modules.Items.ItemManager;
import com.squaaadtech.malifence.registry.modules.Diamidian.DiamidianManager;

public class MainRegisterManager {


    public static final String CLASS_DESCRIPTION = "Manager for registering Block, Items, Materials, etc.";

    public static void RegisterBlocks(){
        BlockManager.Start();
    }
    public static void RegisterItems(){
        ItemManager.Start();
    }
    public static void RegisterMaterials(){

    }
    public static void RegisterAll(){
        MainRegisterManager.RegisterBlocks();
        MainRegisterManager.RegisterItems();
        MainRegisterManager.RegisterMaterials();
        MainRegisterManager.Register.Diamidian();

    }
    public static class Register {
        public static void Diamidian(){
            DiamidianManager.doRegister();
        }
    }
}
