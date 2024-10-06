package mode;

import phone.Mode;

public class LightMode extends AMode{

    @Override
    public Color getScreenColor() {
        return Color.WHITE;
    }

    @Override
    public Color getTextColor() {
        return Color.BLACK;
    }
}
