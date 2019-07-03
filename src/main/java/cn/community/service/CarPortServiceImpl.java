package cn.community.service;

import cn.community.c_interface.CarPortService;
import cn.community.mapper.CarPortMapper;


import cn.community.mapper.HOwnerMapper;
import cn.community.pojo.CarPort;

import cn.community.pojo.CarPortExample;
import cn.community.pojo.HOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPortServiceImpl implements CarPortService {
    @Autowired
    CarPortMapper carPortMapper;
    @Autowired
    HOwnerMapper hOwnerMapper;

    public CarPort getCarPortByHid(Integer OwnerId) {
        CarPortExample carPortExample = new CarPortExample();
        carPortExample.createCriteria().andOwnerIdEqualTo(OwnerId);
        List<CarPort> carPorts = carPortMapper.selectByExample(carPortExample);
        if (carPorts.size() > 0) {
            return carPorts.get(0);
        } else {
            return new CarPort();
        }
    }

    /**
     * 查询所有的车位信息
     * @return
     */
    @Override
    public List<CarPort> selectAllCarPort(int start) {
        List<CarPort> carPorts = carPortMapper.selectAllCartPort((start-1)*11);
        for(CarPort carPort : carPorts){
            HOwner hOwner = hOwnerMapper.selectByPrimaryKey(carPort.getOwnerId());
            carPort.setCarPortOwnerName(hOwner.getOwnerName());
            carPort.setCarNum(hOwner.getCarId());
            if(carPort.getPortStat().equals("used")){
                carPort.setPortStat("租用");
            }else if(carPort.getPortStat().equals("leisure")){
                carPort.setPortStat("空闲");
            }else{
                carPort.setPortStat("售出");
            }
        }
        return carPorts;
    }

    /**
     * 统计所有的车位
     * @return
     */
    @Override
    public long countAll() {
        CarPortExample example = new CarPortExample();
        CarPortExample.Criteria criteria = example.createCriteria();
        criteria.andPortIdIsNotNull();
        long count = carPortMapper.countByExample(example);
        return count;
    }


}
