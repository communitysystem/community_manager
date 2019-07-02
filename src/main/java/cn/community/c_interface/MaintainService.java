package cn.community.c_interface;

import cn.community.pojo.Maintain;

public interface MaintainService {
    public Maintain getMaintainByownId(Integer owerId);
}
