package cn.community.service;

import cn.community.c_interface.CarPortService;
import cn.community.mapper.CarPortMapper;
import cn.community.pojo.CarPort;
import cn.community.pojo.CarPortExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPortServiceImpl implements CarPortService {
    @Autowired
    CarPortMapper carPortMapper;

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
}
