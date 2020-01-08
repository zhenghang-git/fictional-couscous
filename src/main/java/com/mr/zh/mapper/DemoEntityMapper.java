package com.mr.zh.mapper;


import com.mr.zh.entity.DemoEntity;

import java.util.List;

public interface DemoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoEntity record);

    int insertSelective(DemoEntity record);

    DemoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoEntity record);

    int updateByPrimaryKey(DemoEntity record);

    List getDemoList();

    void demoSave(List<DemoEntity> personVoList);
}