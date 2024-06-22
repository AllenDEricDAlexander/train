package top.atluofu.train.business.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import top.atluofu.train.business.req.ConfirmOrderDoReq;
import top.atluofu.train.business.service.ConfirmOrderService;
import top.atluofu.train.common.exception.BusinessExceptionEnum;
import top.atluofu.train.common.resp.CommonResp;

@RestController
@RequestMapping("/confirm-order")
public class ConfirmOrderController {

    private static final Logger LOG = LoggerFactory.getLogger(ConfirmOrderController.class);

    @Value("${spring.profiles.active}")
    private String env;

    @Resource
    private ConfirmOrderService confirmOrderService;

    @GetMapping("/query-line-count/{id}")
    public CommonResp<Integer> queryLineCount(@PathVariable Long id) {
        Integer count = confirmOrderService.queryLineCount(id);
        return new CommonResp<>(count);
    }

    @GetMapping("/cancel/{id}")
    public CommonResp<Integer> cancel(@PathVariable Long id) {
        Integer count = confirmOrderService.cancel(id);
        return new CommonResp<>(count);
    }


}
