package com.kedacom.xlite.sys.modular.timer.tasks;

import com.kedacom.xlite.core.timer.TimerTaskRunner;
import org.springframework.stereotype.Component;

/**
 * 这是一个定时任务的示例程序
 *
 * @author nixiaohan
 * @date 2020/6/30 22:09
 */
@Component
public class SystemOutTaskRunner implements TimerTaskRunner {

    @Override
    public void action() {
        System.out.println("一直往南方开！一直往南方开！");
    }

}
