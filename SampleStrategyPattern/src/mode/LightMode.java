package mode;

public class LightMode extends AMode{

    public LightMode(){
        this.setLightIntensity(20);
    }

    @Override
    public Color getScreenColor() {
        return Color.WHITE;
    }

    @Override
    public Color getTextColor() {
        return Color.BLACK;
    }
}
