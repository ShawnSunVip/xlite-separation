/*
Copyright [2020] [https://www.stylefeng.cn]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Guns采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：

1.请不要删除和修改根目录下的LICENSE文件。
2.请不要删除和修改Guns源码头部的版权声明。
3.请保留源码和相关描述文件的项目出处，作者声明等。
4.分发源码时候，请注明软件出处 https://gitee.com/stylefeng/guns-separation
5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/stylefeng/guns-separation
6.若您的项目无法满足以上几点，可申请商业授权，获取Guns商业授权许可，请在官网购买授权，地址为 https://www.stylefeng.cn
 */
package com.kedacom.xlite.modular.controller;

import com.kedacom.xlite.core.pojo.response.ResponseData;
import com.kedacom.xlite.core.pojo.response.SuccessResponseData;
import com.kedacom.xlite.modular.model.AbModel;
import com.kedacom.xlite.modular.service.ExampleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 一个示例接口
 *
 * @author stylefeng
 * @date 2020/4/9 18:09
 */
@RestController
@RequestMapping("/test")
public class ExampleController  {
    @Resource
    private ExampleService exampleService;

    @RequestMapping("/niceDay")
    public ResponseData niceDay() {
        return new SuccessResponseData("nice day");
    }

    @RequestMapping("/find")
    public ResponseData find(AbModel abModel) {
        return new SuccessResponseData(exampleService.find(abModel));
    }

    @RequestMapping("/delete")
    public ResponseData delete(String ids) {
        exampleService.del(ids);
        return new SuccessResponseData("删除成功了");
    }

    @RequestMapping("/update")
    public ResponseData update(AbModel abModel) {
        exampleService.update(abModel);
        return new SuccessResponseData("更新成功了");
    }

    @RequestMapping("/insert")
    public ResponseData insert(AbModel abModel) {
        exampleService.insert(abModel);
        return new SuccessResponseData("新增成功了");
    }

}
