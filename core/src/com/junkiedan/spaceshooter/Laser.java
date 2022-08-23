package com.junkiedan.spaceshooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

class Laser {

    // position and dimensions of the laser
    Rectangle boundingBox;

    // laser physical characteristics
    float movementSpeed; // world units per second

    // graphics
    TextureRegion textureRegion;

    public Laser(float xCenter, float yBottom,
                 float width, float height,
                 float movementSpeed, TextureRegion textureRegion) {
        this.boundingBox = new Rectangle(xCenter - width / 2, yBottom, width, height);
        this.movementSpeed = movementSpeed;
        this.textureRegion = textureRegion;
    }

    public void draw(Batch batch) {
        batch.draw(textureRegion, boundingBox.x - boundingBox.width / 2f, boundingBox.y, boundingBox.width, boundingBox.height);
    }
}
