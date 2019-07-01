package cn.community.mapper;

import cn.community.pojo.HOwner;
import cn.community.pojo.HOwnerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HOwnerMapper {
    long countByExample(HOwnerExample example);

    int deleteByExample(HOwnerExample example);

    int deleteByPrimaryKey(Integer ownerId);

    int insert(HOwner record);

    int insertSelective(HOwner record);

    List<HOwner> selectByExample(HOwnerExample example);

    HOwner selectByPrimaryKey(Integer ownerId);

    int updateByExampleSelective(@Param("record") HOwner record, @Param("example") HOwnerExample example);

    int updateByExample(@Param("record") HOwner record, @Param("example") HOwnerExample example);

    int updateByPrimaryKeySelective(HOwner record);

    int updateByPrimaryKey(HOwner record);
}