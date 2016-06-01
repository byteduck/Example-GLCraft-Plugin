package net.codepixl.ExamplePlugin;

import net.codepixl.GLCraft.plugin.Plugin;
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
	public boolean isTransparent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canPassThrough() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onBreak(int x, int y, int z, boolean drop, WorldManager worldManager){
		super.onBreak(x, y, z, drop, worldManager);
		worldManager.entityManager.getPlayer().health = 0;
	}
}
