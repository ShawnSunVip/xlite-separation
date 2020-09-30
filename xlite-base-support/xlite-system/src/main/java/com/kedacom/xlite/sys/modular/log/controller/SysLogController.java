package com.kedacom.xlite.sys.modular.log.controller;

import com.kedacom.xlite.core.annotion.BusinessLog;
import com.kedacom.xlite.core.annotion.Permission;
import com.kedacom.xlite.core.enums.LogAnnotionOpTypeEnum;
import com.kedacom.xlite.core.pojo.response.ResponseData;
import com.kedacom.xlite.core.pojo.response.SuccessResponseData;
import com.kedacom.xlite.sys.modular.log.param.SysOpLogParam;
import com.kedacom.xlite.sys.modular.log.param.SysVisLogParam;
import com.kedacom.xlite.sys.modular.log.service.SysOpLogService;
import com.kedacom.xlite.sys.modular.log.service.SysVisLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 系统日志控制器
 *
 * @author nixiaohan
 * @date 2020/3/19 21:14
 */
@RestController
public class SysLogController {

    @Resource
    private SysVisLogService sysVisLogService;

    @Resource
    private SysOpLogService sysOpLogService;

    /**
     * 查询访问日志
     *
     * @author nixiaohan
     * @date 2020/3/20 18:52
     */
    @Permission
    @GetMapping("/sysVisLog/page")
    public ResponseData visLogPage(SysVisLogParam visLogParam) {
        return new SuccessResponseData(sysVisLogService.page(visLogParam));
    }

    /**
     * 查询操作日志
     *
     * @author nixiaohan
     * @date 2020/3/20 18:52
     */
    @Permission
    @GetMapping("/sysOpLog/page")
    public ResponseData opLogPage(SysOpLogParam sysOpLogParam) {
        return new SuccessResponseData(sysOpLogService.page(sysOpLogParam));
    }

    /**
     * 清空访问日志
     *
     * @author nixiaohan
     * @date 2020/3/23 16:28
     */
    @Permission
    @PostMapping("/sysVisLog/delete")
    @BusinessLog(title = "访问日志_清空", opType = LogAnnotionOpTypeEnum.CLEAN)
    public ResponseData visLogDelete() {
        sysVisLogService.delete();
        return new SuccessResponseData();
    }

    /**
     * 清空操作日志
     *
     * @author nixiaohan
     * @date 2020/3/23 16:28
     */
    @Permission
    @PostMapping("/sysOpLog/delete")
    @BusinessLog(title = "操作日志_清空", opType = LogAnnotionOpTypeEnum.CLEAN)
    public ResponseData opLogDelete() {
        sysOpLogService.delete();
        return new SuccessResponseData();
    }
}
