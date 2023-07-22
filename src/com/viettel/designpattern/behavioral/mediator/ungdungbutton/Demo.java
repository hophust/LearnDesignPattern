package com.viettel.designpattern.behavioral.mediator.ungdungbutton;

import com.viettel.designpattern.behavioral.mediator.ungdungbutton.components.*;
import com.viettel.designpattern.behavioral.mediator.ungdungbutton.mediator.Editor;
import com.viettel.designpattern.behavioral.mediator.ungdungbutton.mediator.Mediator;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
