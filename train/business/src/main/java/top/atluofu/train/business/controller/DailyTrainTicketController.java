package top.atluofu.train.business.controller;


import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.train.business.req.DailyTrainTicketQueryReq;
import top.atluofu.train.business.resp.DailyTrainTicketQueryResp;
import top.atluofu.train.business.service.DailyTrainTicketService;
import top.atluofu.train.common.resp.CommonResp;
import top.atluofu.train.common.resp.PageResp;

@RestController
@RequestMapping("/daily-train-ticket")
public class DailyTrainTicketController {

    @Resource
    private DailyTrainTicketService dailyTrainTicketService;

    @GetMapping("/query-list")
    public CommonResp<PageResp<DailyTrainTicketQueryResp>> queryList(@Valid DailyTrainTicketQueryReq req) {
        PageResp<DailyTrainTicketQueryResp> list = dailyTrainTicketService.queryList(req);
        return new CommonResp<>(list);
    }

}
