package com.viettel.designpattern.behavioral.mediator.ungdungghichu.components;

import com.viettel.designpattern.behavioral.mediator.ungdungghichu.mediator.Mediator;
import com.viettel.designpattern.behavioral.mediator.ungdungghichu.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
