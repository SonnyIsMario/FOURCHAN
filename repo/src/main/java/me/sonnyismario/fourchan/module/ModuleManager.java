package me.sonnyismario.fourchan.module;

import me.sonnyismario.fourchan.Main;
import me.sonnyismario.fourchan.module.gui.Watermark;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public ArrayList<Module> modules;

    public ModuleManager()
    {
        (modules = new ArrayList<Module>()).clear();

        this.modules.add(new Watermark());
    }

    public Module getModule(String name)
    {
        for (Module m : this.modules)
        {
            if(m.getName().equalsIgnoreCase(name))
            {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Module> getModuleList()
    {
        return this.modules;
    }

    public static List<Module> getModulesByCategory(Category c)
    {
        List<Module> modules = new ArrayList<Module>();

        for (Module m : Main.moduleManager.modules)
        {
            if (m.getCategory() == c)
            {
                modules.add(m);
            }
        }
        return modules;

    }


}
