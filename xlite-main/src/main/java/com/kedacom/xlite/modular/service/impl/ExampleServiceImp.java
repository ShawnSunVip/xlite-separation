package com.kedacom.xlite.modular.service.impl;

import com.kedacom.xlite.dao.ExampleMapper;
import com.kedacom.xlite.modular.model.AbModel;
import com.kedacom.xlite.modular.service.ExampleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("example")
public class ExampleServiceImp extends ServiceImpl<ExampleMapper, AbModel> implements ExampleService {
    @Resource
    private ExampleMapper exampleMapper;

    @Override
    @Transactional
    public void insert(AbModel abModel) {
        exampleMapper.insert(abModel);
    }

    @Override
    public List<AbModel> find(AbModel abModel) {
        return exampleMapper.find(abModel);
    }

    @Override
    @Transactional
    public void del(String ids) {
        exampleMapper.delete(ids);
    }

    @Override
    @Transactional
    public void update(AbModel abModel) {
        exampleMapper.update(abModel);
    }
}
