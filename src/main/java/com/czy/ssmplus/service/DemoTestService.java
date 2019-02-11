package com.czy.ssmplus.service;

import com.czy.ssmplus.model.Persons;

import java.util.List;

public interface DemoTestService {

    /**
     * 查询所有信息
     * @return 集合
     */
    public List<Persons> selectAll();
}
