package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelBusStopLeft extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBusStopLeft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box0
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box0
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box0
		bodyModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box0
		bodyModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(6F, -22F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[1].setRotationPoint(-8F, -23F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 32, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[2].setRotationPoint(6F, -22F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 32, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[3].setRotationPoint(-8F, -22F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[4].setRotationPoint(-6F, -8F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[5].setRotationPoint(6F, -8F, -7F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}