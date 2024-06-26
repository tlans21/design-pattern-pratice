package factories;

import products.Button;
import products.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
