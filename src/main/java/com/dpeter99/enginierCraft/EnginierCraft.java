package com.dpeter99.enginierCraft;


import com.dpeter99.enginierCraft.handler.ConfigurationHandler;
import com.dpeter99.enginierCraft.init.ModItems;
import com.dpeter99.enginierCraft.proxy.IProxy;
import com.dpeter99.enginierCraft.reference.Reference;
import com.dpeter99.enginierCraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class EnginierCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static EnginierCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        LogHelper.info("Pre Initialization Successfully Finished");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event){



    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }

}
