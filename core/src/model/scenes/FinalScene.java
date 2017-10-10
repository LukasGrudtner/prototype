package model.scenes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;

import model.Scene;
import model.Text;

/**
 * Created by Lukas on 21/08/2017.
 */

public class FinalScene extends Scene {

    private Scene previousScene;

    public FinalScene(Texture background, Text text) {
        super(background, text);
    }

    public void setPreviousScene(Scene previousScene) {
        this.previousScene = previousScene;
    }

    @Override
    public void toNext() {
        prototype.exit();
    }

    @Override
    public void toPrevious() {
        prototype.setCurrentScene(previousScene);
    }
}