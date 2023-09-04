package com.viettel.designpattern.behavioral.iterator.duyetquacackenhtruyenhinh;

public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
