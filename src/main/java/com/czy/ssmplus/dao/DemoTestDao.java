package com.czy.ssmplus.dao;

import com.czy.ssmplus.model.Persons;

import java.util.List;

public interface DemoTestDao {

    /**
     * 查询所有信息
     * @return 集合
     */
    public List<Persons> selectAll();
}
