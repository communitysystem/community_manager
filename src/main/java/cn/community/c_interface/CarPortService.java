package cn.community.c_interface;

import cn.community.pojo.CarPort;

public interface CarPortService {
    public CarPort getCarPortByHid(Integer OwnerId);
}
