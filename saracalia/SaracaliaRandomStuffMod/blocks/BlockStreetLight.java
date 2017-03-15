package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelSmallStreetLight;
import saracalia.SaracaliaRandomStuffMod.models.ModelStreetLight;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.StreetLightTE;

public class BlockStreetLight{

	public BlockStreetLight(String blockname, Class tile) {
		super();
		this.setLightLevel(1.0F);
	}

	private void setLightLevel(float f) {
		
	}

	public static void register(){
		RegistryContainer.addBlock("StreetLight", StreetLightTE.StreetLight.class, new ModelStreetLight(), 2);
		RegistryContainer.addBlock("SmallStreetLight", StreetLightTE.SmallStreetLight.class, new ModelSmallStreetLight(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}