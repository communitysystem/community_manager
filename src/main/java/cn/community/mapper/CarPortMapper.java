package cn.community.mapper;

import cn.community.pojo.CarPort;
import cn.community.pojo.CarPortExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarPortMapper {
    long countByExample(CarPortExample example);

    int deleteByExample(CarPortExample example);

    int deleteByPrimaryKey(String portId);

    int insert(CarPort record);

    int insertSelective(CarPort record);

    List<CarPort> selectByExample(CarPortExample example);

    CarPort selectByPrimaryKey(String portId);

    int updateByExampleSelective(@Param("record") CarPort record, @Param("example") CarPortExample example);

    int updateByExample(@Param("record") CarPort record, @Param("example") CarPortExample example);

    int updateByPrimaryKeySelective(CarPort record);

    int updateByPrimaryKey(CarPort record);
}