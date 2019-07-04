package cn.community.c_interface;

import cn.community.pojo.CarPort;

import java.util.List;

public interface CarPortService {
    public CarPort getCarPortByHid(Integer OwnerId);

    /**
     * 查询出所有的车位信息给管理员用
     */
    public List<CarPort> selectAllCarPort(int start);

    /**
     * 统计车位的个数
     * @return
     */
    public long countAll();

    /**
     * 删除车位
     * @param carPortId
     */
    public void deleteCarPort(String carPortId);

    /**
     * 添加停车位
     * @
     */
    public void addCarPort();
}
