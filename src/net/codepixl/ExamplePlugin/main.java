package net.codepixl.ExamplePlugin;

import java.io.IOException;

import net.codepixl.GLCraft.GLCraft;
import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.world.tile.PluginTile;

public class Main implements Plugin{

	@Override
	public void init() {
		GLCraft.getGLCraft().getPluginManager().addTile(new ExampleTile());
	}
	
	public static void main(String[] args) throws IOException{
		GLCraft.devEnvironment(new Main(),false);
	}

	@Override
	public void update() {
		
	}

}
