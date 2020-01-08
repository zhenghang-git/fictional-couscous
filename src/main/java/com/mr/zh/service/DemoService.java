package com.mr.zh.service;

import com.mr.zh.entity.DemoEntity;

import java.util.List;

public interface DemoService {
    List getDemoList();
    void demoSave(List<DemoEntity> personVoList);
    
}
