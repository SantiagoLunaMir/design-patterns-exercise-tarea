package oop.inheritance.tpv.ingenico;

import oop.inheritance.tpv.Display;
import oop.inheritance.tpv.Keyboard;
import oop.inheritance.tpv.TpvDeviceFactory;

public class IngenicoDeviceFactory extends TpvDeviceFactory {

    @Override
    public Keyboard getKeyboard() {
        return new IngenicoKeyboardAdapter();
    }

    @Override
    public Display getDisplay() {
        return new IngenicoDisplayAdapter();
    }
}
