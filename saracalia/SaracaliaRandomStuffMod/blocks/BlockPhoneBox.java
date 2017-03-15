package saracalia.SaracaliaRandomStuffMod.blocks;

import net.minecraft.block.Block;
import saracalia.SaracaliaRandomStuffMod.models.ModelPhoneBox;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.tileentities.PhoneBoxTE;

public class BlockPhoneBox {

	public static void register(){
		RegistryContainer.addBlock("PhoneBox", PhoneBoxTE.PhoneBox.class, new ModelPhoneBox(), 2);
	}
    
	public static Block getBlock(String blockname){
		return RegistryContainer.getBlock(blockname);
	}

}
