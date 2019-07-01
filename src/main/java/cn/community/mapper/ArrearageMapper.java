package cn.community.mapper;

import cn.community.pojo.Arrearage;
import cn.community.pojo.ArrearageExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ArrearageMapper {
    long countByExample(ArrearageExample example);

    int deleteByExample(ArrearageExample example);

    int deleteByPrimaryKey(String arrearageId);

    int insert(Arrearage record);

    int insertSelective(Arrearage record);

    List<Arrearage> selectByExample(ArrearageExample example);

    Arrearage selectByPrimaryKey(String arrearageId);

    int updateByExampleSelective(@Param("record") Arrearage record, @Param("example") ArrearageExample example);

    int updateByExample(@Param("record") Arrearage record, @Param("example") ArrearageExample example);

    int updateByPrimaryKeySelective(Arrearage record);

    int updateByPrimaryKey(Arrearage record);
}