package net.codepixl.ExamplePlugin;

import java.io.IOException;

import net.codepixl.GLCraft.GLCraft;
import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.world.tile.PluginTile;

public class main implements Plugin{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		GLCraft.getGLCraft().getPluginManager().addTile(new ExampleTile());
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("Compiled.");
	}

}
