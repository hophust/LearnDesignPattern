package com.viettel.designpattern.behavioral.mediator.ungdungbutton.components;
import com.viettel.designpattern.behavioral.mediator.ungdungbutton.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;
public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
