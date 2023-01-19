package com.nana.helper.DroppingAssets;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class WhiteBullet {
    public Texture texture;
    public Rectangle rectangle;
    
    public WhiteBullet(Texture texture, float randomX){
        this.texture = texture;
        rectangle = new Rectangle(randomX, 480, 48, 48);
    }

     
    public Texture getTexture() {
        return texture;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}