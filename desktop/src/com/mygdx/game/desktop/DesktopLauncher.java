package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.FBirdMobile;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = FBirdMobile.WIDTH;
		config.height = FBirdMobile.HEIGHT;
		config.title = FBirdMobile.TITLE;
		new LwjglApplication(new FBirdMobile(), config);
	}
}
