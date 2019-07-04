package cn.community.c_interface;

import cn.community.pojo.Maintain;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface MaintainService {
    public Maintain getMaintainByownId(Integer owerId);

    public List<Maintain> getAllMainByHId(Integer owerId);

    void delById(String id);

    void updateByMaintanId(String maintainId, String maintainInfo) throws Exception;

    void add(String maintainInfo, Integer ownerId) throws Exception;
}
