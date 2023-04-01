package com.viettel.test.OPC11Part2.chuong2;

class RollerCoaster {
}

class Events {
    @ZooAttraction
    String rideTrain() {
        return ( String) "Fun!";
    }
    @ZooAttraction
    Events( String description) {
        super();
    }

    int numPassengers;
}
