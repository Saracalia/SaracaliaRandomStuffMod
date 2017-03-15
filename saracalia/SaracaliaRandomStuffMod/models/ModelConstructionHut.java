// Model: ConstructionHut
// Model Creator: 
// Created on: 14.01.2017 - 23:41:47
// Last changed on: 14.01.2017 - 23:41:47

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelConstructionHut extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelConstructionHut() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 2, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-40F, 8F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 80, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-40F, -28F, -24F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 80, 2, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-40F, -30F, -24F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 36, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-40F, -28F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 80, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-40F, -10F, -24F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-40F, -24F, -24F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 36, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(38F, -28F, -22F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-11F, -24F, 22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(30F, -24F, 22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 80, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-40F, -28F, 22F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 32, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-40F, -24F, 22F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 51, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-11F, -10F, 22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 32, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(-30F, -24F, 22F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-15F, -10F, 23F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-3F, -24F, -24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(30F, -24F, -24F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 27, 14, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-30F, -24F, -23F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 14, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(7F, -24F, -23F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 23, 14, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(7F, -24F, 23F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}