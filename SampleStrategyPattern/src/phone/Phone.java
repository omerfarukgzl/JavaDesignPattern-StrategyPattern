package phone;

public class Phone {
    private int lightIntensity;
    private static Phone instance;
    public int getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(int lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    private Phone(){

    }

    public static Phone getInstance(){
        if(instance!=null){
            instance = new Phone();
        }
        return instance;
    }

}
