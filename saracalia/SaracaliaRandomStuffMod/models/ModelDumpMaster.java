// Model: DumpMaster
// Model Creator: 
// Created on: 10.01.2017 - 23:54:31
// Last changed on: 10.01.2017 - 23:54:31

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelDumpMaster extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelDumpMaster() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 18, 28, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -10F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 1, 15, 0F, -1F, 0F, -1F, -1F, -2F, -1F, -1F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-8F, -11F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 17, 1, 15, 0F, -1F, 0F, -1F, -1F, -2F, -1F, -1F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-8F, -11F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-8F, 8F, 13F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(6F, 8F, 13F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 4
		bodyModel[5].setRotationPoint(-8F, 8F, -14F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 4
		bodyModel[6].setRotationPoint(6F, 8F, -14F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 4
		bodyModel[7].setRotationPoint(6F, -9.5F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 4
		bodyModel[8].setRotationPoint(6F, -9.5F, 5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}