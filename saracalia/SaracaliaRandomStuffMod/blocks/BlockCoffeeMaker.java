package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelCoffeeMaker;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.CoffeeMakerTE;

public class BlockCoffeeMaker {

	public static void register(){
		RegistryContainer.addBlock("CoffeeMaker", CoffeeMakerTE.CoffeeMaker.class, new ModelCoffeeMaker(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}