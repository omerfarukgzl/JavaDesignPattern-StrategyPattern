package mode;

import phone.Phone;

public abstract class AMode implements IMode{

    @Override
    public int getLightIntensity(){
       return Phone.getInstance().getLightIntensity();
    }
    
}
