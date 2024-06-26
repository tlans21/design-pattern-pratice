import application.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowFactory;

public class Main {

    public static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowFactory();
        }
        app = new Application(factory);

        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
        app.click();
    }
}