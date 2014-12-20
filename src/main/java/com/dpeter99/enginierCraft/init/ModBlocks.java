package com.dpeter99.enginierCraft.init;

import com.dpeter99.enginierCraft.block.BlockFlag;
import com.dpeter99.enginierCraft.block.BlockEngCraft;
import com.dpeter99.enginierCraft.reference.Names;
import com.dpeter99.enginierCraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEngCraft flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}
