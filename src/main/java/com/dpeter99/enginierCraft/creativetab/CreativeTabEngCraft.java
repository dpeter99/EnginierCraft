package com.dpeter99.enginierCraft.creativetab;

import com.dpeter99.enginierCraft.init.ModItems;
import com.dpeter99.enginierCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEngCraft
{
    public static final CreativeTabs ENG_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.circuit;
        }
    };
}
