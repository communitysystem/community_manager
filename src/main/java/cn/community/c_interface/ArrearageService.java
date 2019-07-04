package cn.community.c_interface;


import cn.community.pojo.Arrearage;

import java.util.List;

public interface ArrearageService {
    public Arrearage getArrearageByHId(Integer hId);

    List<Arrearage> getAll();

    void delById(String id);
}
