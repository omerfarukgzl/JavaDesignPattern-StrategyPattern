package mode;

import phone.Mode;

import java.util.HashMap;

public class StrategyFactory {

    private static StrategyFactory instance;
    private static HashMap<Mode,IMode> phoneMode = new HashMap<Mode,IMode>();

    private StrategyFactory(){
        phoneMode.put(Mode.DARK,new DarkMode());
        phoneMode.put(Mode.LIGHT,new LightMode());
    }

    public static StrategyFactory getInstance(){
        if(instance==null){
            instance = new StrategyFactory();
        }
        return instance;
    }

    public IMode getMode(Mode mode){
        switch(mode){
            case DARK:
                return phoneMode.get(Mode.DARK);
            case LIGHT:
                return phoneMode.get(Mode.LIGHT);
            default:
                return phoneMode.get(Mode.LIGHT);
        }
    }

}
