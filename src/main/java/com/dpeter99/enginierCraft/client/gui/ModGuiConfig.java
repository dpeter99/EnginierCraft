package com.dpeter99.enginierCraft.client.gui;

import com.dpeter99.enginierCraft.handler.ConfigurationHandler;
import com.dpeter99.enginierCraft.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen GuiScreen)
    {

        super(GuiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
