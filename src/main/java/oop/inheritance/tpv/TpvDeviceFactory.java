package oop.inheritance.tpv;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.ingenico.IngenicoDeviceFactory;
import oop.inheritance.tpv.verifone240.Verifone240DeviceFactory;

public abstract class TpvDeviceFactory {
    public abstract Keyboard getKeyboard();

    public abstract Display getDisplay();

    public TpvDeviceFactory getFactory(SupportedTerminal supportedTerminal) {
        return switch (supportedTerminal) {
            case INGENICO -> new IngenicoDeviceFactory();
            case VERIFONE -> new Verifone240DeviceFactory();
        };
    }
}
