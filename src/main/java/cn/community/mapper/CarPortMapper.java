package cn.community.mapper;

import cn.community.pojo.CarPort;
import cn.community.pojo.CarPortExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarPortMapper {
    long countByExample(CarPortExample example);

    int deleteByExample(CarPortExample example);

    int insert(CarPort record);

    int insertSelective(CarPort record);

    List<CarPort> selectByExample(CarPortExample example);

    int updateByExampleSelective(@Param("record") CarPort record, @Param("example") CarPortExample example);

    int updateByExample(@Param("record") CarPort record, @Param("example") CarPortExample example);

    //自己添加的方法
    List<CarPort> selectAllCartPort(int start);
}