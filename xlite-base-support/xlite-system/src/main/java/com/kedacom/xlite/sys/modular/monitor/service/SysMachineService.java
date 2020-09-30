package com.kedacom.xlite.sys.modular.monitor.service;

import com.kedacom.xlite.sys.modular.monitor.result.SysMachineResult;

/**
 * 系统属性监控service接口
 *
 * @author nixiaohan
 * @date 2020/6/5 14:39
 */
public interface SysMachineService {

    /**
     * 系统属性监控
     *
     * @return 系统属性结果集
     * @author nixiaohan
     * @date 2020/6/5 14:45
     */
    SysMachineResult query();
}
