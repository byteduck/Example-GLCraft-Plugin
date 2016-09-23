package net.codepixl.ExamplePlugin;

import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.util.BreakSource;
import net.codepixl.GLCraft.world.WorldManager;
import net.codepixl.GLCraft.world.tile.PluginTile;

public class ExampleTile extends PluginTile{

	public ExampleTile(Plugin p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ExampleTile";
	}
	
	@Override
	public void onBreak(int x, int y, int z, boolean drop, BreakSource source, WorldManager worldManager){
		super.onBreak(x, y, z, drop, source, worldManager);
		worldManager.entityManager.getPlayer().health = 0;
	}
}
