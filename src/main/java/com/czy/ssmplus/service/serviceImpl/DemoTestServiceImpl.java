package com.czy.ssmplus.service.serviceImpl;

import com.czy.ssmplus.dao.DemoTestDao;
import com.czy.ssmplus.model.Persons;
import com.czy.ssmplus.service.DemoTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("demoTestService")
public class DemoTestServiceImpl implements DemoTestService {
    /* 属性 */
    @Resource
    private DemoTestDao demoTestDao;
    /**
     * 查询全部信息
     *
     * @return persons集合
     */
    public List<Persons> selectAll() {
        return demoTestDao.selectAll();
    }

}
