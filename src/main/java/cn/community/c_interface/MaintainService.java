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

    public List<Maintain> queryAllMaintain();
    /**
     * 删除维修
     */
    public void deleteMaintain(String maintainId);

    /**
     * 回复维修信息
     */
    public void rebackMaintain(String maintainId,String comment);
}
