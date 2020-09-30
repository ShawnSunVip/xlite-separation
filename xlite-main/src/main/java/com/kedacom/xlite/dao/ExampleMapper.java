package com.kedacom.xlite.dao;

import com.kedacom.xlite.modular.model.AbModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ExampleMapper extends BaseMapper<AbModel> {
    /*****查询（支持模糊查询）****/
    List<AbModel> find(AbModel abModel);
    /*****删除，采用in（）的方式****/
    void delete(@Param("ids") String ids);
    /*****更新（id一定要有）****/
    void update(AbModel abModel);

}
