// Model: StreetLight
// Model Creator: 
// Created on: 12.01.2017 - 16:34:08
// Last changed on: 12.01.2017 - 16:34:08

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;

public class ModelStreetLight extends ModelVehicle //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelStreetLight() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26F, -3F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-33F, -3F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-28F, -3F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-33F, -2F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-33F, -2F, 1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-33F, -2F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-32F, -2.5F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(0F, -3F, -1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}