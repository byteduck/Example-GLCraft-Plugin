package net.codepixl.ExamplePlugin;

import net.codepixl.GLCraft.world.tile.PluginTile;

public class ExampleTile extends PluginTile{

	@Override
	public float[] getTexCoords() {
		// TODO Auto-generated method stub
		return new float[]{1,1};
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ExampleTile";
	}

	@Override
	public boolean isTransparent() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canPassThrough() {
		// TODO Auto-generated method stub
		return true;
	}
}
