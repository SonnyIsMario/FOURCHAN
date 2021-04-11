package me.sonnyismario.fourchan.gui;

import me.sonnyismario.fourchan.module.Module;
import me.sonnyismario.fourchan.module.ModuleManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClickGUI extends Gui {
    private Minecraft mc = Minecraft.getMinecraft();
    private FontRenderer mcfr = mc.fontRenderer;

    @SubscribeEvent
    public void renderOverlay(RenderGameOverlayEvent event)
    {
        // Watermark
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT)
        {

        }
    }
}
