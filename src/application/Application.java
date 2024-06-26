package application;

import factories.GUIFactory;
import products.Button;
import products.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
    }

    public void click(){
        checkBox.click();
    }
}
