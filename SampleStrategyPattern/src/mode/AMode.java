package mode;

public abstract class AMode implements IMode{

    private int lightIntensity;

    public void setLightIntensity(int lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    @Override
    public int getLightIntensity(){
       return lightIntensity;
    }
    
}
