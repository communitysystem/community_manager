package cn.community.mapper;

import cn.community.pojo.Complaint;
import cn.community.pojo.ComplaintExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintMapper {
    long countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(String complaintId);

    int insert(Complaint record);

    int insertSelective(Complaint record);

    List<Complaint> selectByExampleWithBLOBs(ComplaintExample example);

    List<Complaint> selectByExample(ComplaintExample example);

    Complaint selectByPrimaryKey(String complaintId);

    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExampleWithBLOBs(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(Complaint record);

    int updateByPrimaryKeyWithBLOBs(Complaint record);

    int updateByPrimaryKey(Complaint record);

    int updateByPriMaryKeyAndComment(@Param("complaintId") String complaintId, @Param("complaintComment") String complaintComment);
}