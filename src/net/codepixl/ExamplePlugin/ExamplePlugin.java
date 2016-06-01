package net.codepixl.ExamplePlugin;

import java.io.IOException;

import net.codepixl.GLCraft.GLCraft;
import net.codepixl.GLCraft.item.crafting.CraftingManager;
import net.codepixl.GLCraft.item.crafting.Recipe;
import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.world.item.ItemStack;
import net.codepixl.GLCraft.world.tile.Tile;

public class ExamplePlugin implements Plugin{
	
	public ExampleTile exampleTile = new ExampleTile(this);
	
	@Override
	public void init(){
		GLCraft.getGLCraft().getPluginManager().addTile(exampleTile);
		CraftingManager.addRecipe(new Recipe(new ItemStack(Tile.Wood),new ItemStack(),new ItemStack(),new ItemStack(Tile.Wood),new ItemStack(exampleTile,64)));
	}
	
	public static void main(String[] args) throws IOException{
		GLCraft.devEnvironment(new ExamplePlugin(),false);
	}

	@Override
	public void update(){
		
	}

}
