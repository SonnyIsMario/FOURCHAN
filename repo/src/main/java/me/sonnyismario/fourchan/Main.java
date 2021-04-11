package me.sonnyismario.fourchan;

import me.sonnyismario.fourchan.module.ModuleManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.opengl.Display;

@Mod(modid = "fourchan", version = "b1")
public class Main {

    public static final String MODNAME = "Fourchan";
    public static final String MODID = "fourchan";
    public static final String MODVER = "b1";
    public static final String CHAT_PREFIX = "*";

    public static ModuleManager moduleManager;

    @Mod.Instance
    public static fourchan INSTANCE;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(INSTANCE);

        moduleManager = new ModuleManager();

        Display.setTitle(MODNAME + " " + MODVER);
    }

}
