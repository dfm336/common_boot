package com.dfm.boot.example.controllers;

import com.dfm.boot.example.controllers.cmd.CustomerCmd;
import com.dfm.boot.example.controllers.pojo.BasePage;
import com.dfm.boot.example.controllers.qrys.CustomerListQry;
import com.dfm.boot.example.controllers.vos.CustomerListVO;
import com.dfm.boot.example.controllers.vos.CustomerStatisticsVO;
import com.dfm.boot.example.controllers.pojo.Response;
import org.springframework.web.bind.annotation.*;

/**
 * @author daifengming
 */
@RestController
@RequestMapping("/rest/customer")
public class CustomerController {

    /**
     * 我的客户信息统计
     */
    @GetMapping("/statistics")
    public Response<CustomerStatisticsVO> statistics() {
        CustomerStatisticsVO customerStatisticsVO = new CustomerStatisticsVO();
        customerStatisticsVO.setTotal(100);
        customerStatisticsVO.setMarketing(90);
        customerStatisticsVO.setNoMarketing(10);
        return Response.success(customerStatisticsVO);
    }

    /**
     * 我的客户：分页列表
     */
    @GetMapping("/list")
    public Response<BasePage<CustomerListVO>> list(CustomerListQry qry) {
        return Response.success(BasePage.emptyPage(100));
    }

    /**
     * 其中，输入客户名称之后，系统将进行规则判断，此新增客户是否已存
     * 在在系统白名单客户内；如已存在，则提示营销人员，该客户已属于白名单客户，
     */
    @PostMapping("/checkWhiteList")
    public Response<Boolean> checkWhiteList() {
        return Response.success(true);
    }

    /**
     * 新增客户
     */
    @PostMapping("/add")
    public Response<Boolean> add(@RequestBody CustomerCmd cmd) {
        return Response.success(true);
    }


    /**
     * 修改客户
     */
    @PostMapping("/update")
    public Response<Boolean> update(@RequestBody CustomerCmd cmd) {
        return Response.success(true);
    }


    /**
     * 详情
     */
    @GetMapping("/detail")
    public Response<CustomerCmd> detail() {
        return Response.success(new CustomerCmd());
    }





}
