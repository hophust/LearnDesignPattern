package com.viettel.designpattern.behavioral.mediator.ungdungghichu.components;

import com.viettel.designpattern.behavioral.mediator.ungdungghichu.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
