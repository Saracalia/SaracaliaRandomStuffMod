//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LanPhone
// Model Creator: 
// Created on: 12.01.2017 - 14:10:32
// Last changed on: 12.01.2017 - 14:10:32

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;

public class ModelLanPhone extends ModelVehicle //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelLanPhone() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, 8F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(1F, 4F, -1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}