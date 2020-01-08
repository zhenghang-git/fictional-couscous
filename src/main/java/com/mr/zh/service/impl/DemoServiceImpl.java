package com.mr.zh.service.impl;

import com.mr.zh.entity.DemoEntity;
import com.mr.zh.mapper.DemoEntityMapper;
import com.mr.zh.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoServiceImpl
 * @Description: TODO
 * @Author zhenghang
 * @date 2020/1/4
 * @Version V1.0
 **/
@Service
public class DemoServiceImpl  implements DemoService {

    @Resource
    private DemoEntityMapper demoEntityMapper;
    @Override
    public List getDemoList() {
        return demoEntityMapper.getDemoList();
    }

    @Override
    public void demoSave(List<DemoEntity> personVoList) {

        demoEntityMapper.demoSave(personVoList);
    }
}
