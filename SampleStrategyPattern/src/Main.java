import mode.IMode;
import mode.StrategyFactory;
import phone.Mode;

public class Main {
    public static void main(String[] args) {
        final Mode MODE = Mode.DARK;
        // final Mode MODE = Mode.LIGHT;
        IMode currentMode = StrategyFactory.getInstance().getMode(MODE);

        System.out.println("Mode: " + MODE);
        System.out.println("Text Color : " +  currentMode.getTextColor());
    }
}