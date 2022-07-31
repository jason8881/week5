package week5coding;

public class App {

    public static void main(String[] args) {


        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        asteriskLogger.Log("Hi!");
        asteriskLogger.Error("Bye!");

        System.out.println();

        spacedLogger.Log("Hello");
        spacedLogger.Error("Wohoo!");
    }
	
}


