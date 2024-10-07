package mode;

import phone.Mode;

public class DarkMode extends AMode{

    public DarkMode(){
        this.setLightIntensity(10);
    }

    @Override
    public Color getScreenColor() {
        return Color.BLACK;
    }

    @Override
    public Color getTextColor() {
        return Color.WHITE;
    }
}
