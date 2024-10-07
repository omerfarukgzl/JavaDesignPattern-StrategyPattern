package mode;

import phone.Mode;

import java.util.HashMap;
import java.util.function.Supplier;

public class StrategyFactory {

    private static StrategyFactory instance;
    private static HashMap<Mode,IMode> phoneMode = new HashMap<Mode,IMode>();

    private StrategyFactory(){

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
                return getIMode(mode, DarkMode::new);
            case LIGHT:
                return getIMode(mode, LightMode::new);
            default:
                return new LightMode();
        }
    }

    public IMode getIMode(Mode mode, Supplier<IMode> supplier){
        if(! phoneMode.containsKey(mode))
            phoneMode.put(mode, supplier.get());
        return phoneMode.get(mode);
    }

}
