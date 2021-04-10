package me.sonnyismario.fourchan.module;

import net.minecraftforge.common.MinecraftForge;

public class Module {

    public String name;
    public String desc;
    private int key;
    private Category category;
    public boolean toggled;

    public Module(String name, String desc, Category category) {
        super();
        this.name = name;
        this.desc = desc;
        this.key = 0;
        this.category = category;
        this.toggled = false;
    }

    public String getDesc()
    {
        return desc;
    }
    public void setDesc()
    {
        this.desc = desc;
    }

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public boolean isToggled()
    {
        return toggled;
    }

    public void setToggled()
    {
        this.toggled = toggled;
    }

    public void toggle()
    {
        if (this.toggled)
        {
            onEnable();
        }
        else
        {
            onDisable();
        }
    }

    public String getName()
    {
        return this.name;
    }

    public Category getCategory()
    {
        return this.category;
    }

    public void onEnable()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void onDisable()
    {
        MinecraftForge.EVENT_BUS.unregister(this);
    }
}
