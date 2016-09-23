package net.codepixl.ExamplePlugin;

import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.world.item.PluginItem;

public class ExampleItem extends PluginItem{
	
	public ExampleItem(Plugin p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName(){
		return "ExampleItem";
	}
	
}
