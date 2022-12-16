package com.dfm.boot.example.helper.excel;

import com.alibaba.fastjson.JSONArray;
import com.dfm.boot.example.domain.ProjectInfo;
import com.dfm.boot.example.mappers.ProjectInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:fengming.dai
 */
@Component
public class DataDealUtil {

    @Resource
    ProjectInfoMapper projectInfoMapper;

    public void save(List<UploadCustomerData> cachedDataList, Long taskId) {
        List<ProjectInfo> list = cachedDataList.stream().map(itm -> {
            ProjectInfo info = new ProjectInfo();
            BeanUtils.copyProperties(itm, info);
            info.setIrr(new BigDecimal(itm.getIrr().replace('%',' ').trim()).divide(new BigDecimal(100)));
            return info;
        }).collect(Collectors.toList());
        System.out.println(JSONArray.toJSONString(list));
//        ProjectInfo projectInfo = list.get(0);
//        projectInfoMapper.insert(projectInfo);
        projectInfoMapper.insertList(list);

    }
}
