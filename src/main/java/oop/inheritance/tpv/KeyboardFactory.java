package oop.inheritance.tpv;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.ingenico.IngenicoDisplayAdapter;
import oop.inheritance.tpv.ingenico.IngenicoKeyboardAdapter;
import oop.inheritance.tpv.verifone240.Verifone240DisplayAdapter;
import oop.inheritance.tpv.verifone240.Verifone240KeyboardAdapter;

public class KeyboardFactory {
    public static Keyboard getKeyboard(SupportedTerminal supportedTerminal) {
        if (supportedTerminal == SupportedTerminal.INGENICO) {
            return new IngenicoKeyboardAdapter();
        } else {
            return new Verifone240KeyboardAdapter();
        }
    }
}
