package com.kedacom.xlite.sys.modular.monitor.service;

import com.kedacom.xlite.sys.modular.monitor.param.SysOnlineUserParam;
import com.kedacom.xlite.sys.modular.monitor.result.SysOnlineUserResult;

import java.util.List;

/**
 * 系统在线用户service接口
 *
 * @author nixiaohan
 * @date 2020/4/7 17:06
 */
public interface SysOnlineUserService {

    /**
     * 系统在线用户列表
     *
     * @param sysOnlineUserParam 查询参数
     * @return 在线用户列表
     * @author nixiaohan
     * @date 2020/4/7 17:09
     */
    List<SysOnlineUserResult> list(SysOnlineUserParam sysOnlineUserParam);

    /**
     * 系统在线用户强退
     *
     * @param sysOnlineUserParam 操作参数
     * @author nixiaohan
     * @date 2020/4/7 20:20
     */
    void forceExist(SysOnlineUserParam sysOnlineUserParam);
}
