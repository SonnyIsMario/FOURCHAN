package me.sonnyismario.fourchan;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.opengl.Display;

@Mod(modid = "fourchan", version = "b1")
public class fourchan {

    public static final String MODNAME = "Fourchan";
    public static final String MODID = "fourchan";
    public static final String MODVER = "b1";
    public static final String CHAT_PREFIX = "*";

    @Mod.Instance
    public static fourchan INSTANCE;

    public fourchan()
    {
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Display.setTitle(MODNAME + " " + MODVER);
    }

}
