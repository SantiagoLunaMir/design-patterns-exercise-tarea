package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Display;
import oop.library.ingenico.services.IngenicoDisplay;

public class IngenicoDisplayAdapter implements Display {
    IngenicoDisplay ingenicoDisplay= new IngenicoDisplay();
    @Override
    public void print(int x, int y, String message) {
        ingenicoDisplay.showMessage(x,y,message);
    }
}
