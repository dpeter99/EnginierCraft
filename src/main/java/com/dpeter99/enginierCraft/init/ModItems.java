package com.dpeter99.enginierCraft.init;

import com.dpeter99.enginierCraft.item.ItemTestCircuit;
import com.dpeter99.enginierCraft.item.ItemEngCraft;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{

    public static final ItemEngCraft circuit = new ItemTestCircuit();

    public static void init()
    {
        GameRegistry.registerItem(circuit,"TestCircuit");
    }
}
