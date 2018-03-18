package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FBirdMobile;

/**
 * Created by admin on 17.03.2018.
 */

public class MenuState extends State {

    public Texture background;
    public Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FBirdMobile.WIDTH, FBirdMobile.HEIGHT);
        sb.draw(playBtn, (FBirdMobile.WIDTH / 2) - (playBtn.getWidth() / 2), FBirdMobile.HEIGHT / 3);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
