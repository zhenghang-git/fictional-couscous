package com.mr.zh.Controller;

import com.mr.zh.entity.DemoEntity;
import com.mr.zh.service.DemoService;
import com.mr.zh.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName DemoController
 * @Description: TODO
 * @Author zhenghang
 * @date 2020/1/4
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping
    public void exportExcel(HttpServletResponse response) throws IOException {
        //查询数据库t_demo 的数据7
        List demoList = demoService.getDemoList();
        //将查询出的list放入easypoi工具类导出
        ExcelUtils.exportExcel(demoList, "测试信息表", "测试信息", DemoEntity.class, "测试信息", response);

    }

    @PostMapping
    public String importExcel(@RequestBody @RequestParam("file") MultipartFile file) throws IOException {

        List<DemoEntity> personVoList = ExcelUtils.importExcel(file, DemoEntity.class);

        demoService.demoSave(personVoList);

        return  "导入成功";
    }

}
