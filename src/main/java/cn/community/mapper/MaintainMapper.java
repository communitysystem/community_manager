package cn.community.mapper;

import cn.community.pojo.Maintain;
import cn.community.pojo.MaintainExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MaintainMapper {
    long countByExample(MaintainExample example);

    int deleteByExample(MaintainExample example);

    int deleteByPrimaryKey(String maintainId);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    List<Maintain> selectByExampleWithBLOBs(MaintainExample example);

    List<Maintain> selectByExample(MaintainExample example);

    Maintain selectByPrimaryKey(String maintainId);

    int updateByExampleSelective(@Param("record") Maintain record, @Param("example") MaintainExample example);

    int updateByExampleWithBLOBs(@Param("record") Maintain record, @Param("example") MaintainExample example);

    int updateByExample(@Param("record") Maintain record, @Param("example") MaintainExample example);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKeyWithBLOBs(Maintain record);

    int updateByPrimaryKey(Maintain record);

    void updateByMaintanId(@Param("maintainId") String maintainId, @Param("maintainInfo") String maintainInfo);
}