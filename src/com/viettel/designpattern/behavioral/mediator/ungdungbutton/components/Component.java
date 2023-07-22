package com.viettel.designpattern.behavioral.mediator.ungdungbutton.components;

import com.viettel.designpattern.behavioral.mediator.ungdungbutton.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
