package cn.community.service;


import cn.community.c_interface.ArrearageService;
import cn.community.mapper.ArrearageMapper;
import cn.community.pojo.Arrearage;
import cn.community.pojo.ArrearageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrearageServiceImpl implements ArrearageService {
    @Autowired
    ArrearageMapper arrearageMapper;

    @Override
    public Arrearage getArrearageByHId(Integer hId) {

        ArrearageExample arrearageExample = new ArrearageExample();
        arrearageExample.createCriteria().andOwnerIdEqualTo(hId);
        List<Arrearage> arrearages = arrearageMapper.selectByExample(arrearageExample);
        if (arrearages.size() > 0) {
            return arrearages.get(0);
        } else {
            return new Arrearage();
        }
    }
}
