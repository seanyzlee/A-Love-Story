package com.nana.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Love extends Game {
	public SpriteBatch batch;
	public BitmapFont font;

	
	@Override
	public void create() {
		batch = new SpriteBatch();
		
		

		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();



	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
