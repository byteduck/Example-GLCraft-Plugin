package net.codepixl.ExamplePlugin;

import java.io.IOException;

import org.lwjgl.LWJGLException;

import net.codepixl.GLCraft.GLCraft;
import net.codepixl.GLCraft.plugin.Plugin;
import net.codepixl.GLCraft.world.crafting.CraftingManager;
import net.codepixl.GLCraft.world.crafting.Recipe;
import net.codepixl.GLCraft.world.item.ItemStack;
import net.codepixl.GLCraft.world.tile.Tile;

public class ExamplePlugin implements Plugin{
	
	public ExampleTile exampleTile;
	public ExampleItem exampleItem;
	
	@Override
	public void init() throws Recipe.InvalidRecipeException{
		exampleTile = new ExampleTile(this);
		exampleItem = new ExampleItem(this);
		GLCraft.getGLCraft().getPluginManager().addTile(exampleTile);
		GLCraft.getGLCraft().getPluginManager().addItem(exampleItem);
		CraftingManager.addRecipe(new Recipe(new ItemStack(exampleItem,64),"w "," w",'w',new ItemStack(Tile.Wood)));
		CraftingManager.addRecipe(new Recipe(new ItemStack(exampleTile),"ee","ee",'e',new ItemStack(exampleItem)));
	}
	
	public static void main(String[] args) throws IOException, LWJGLException{
		GLCraft.devEnvironment(new ExamplePlugin(),false);
	}

	@Override
	public void update(){
		
	}

}
