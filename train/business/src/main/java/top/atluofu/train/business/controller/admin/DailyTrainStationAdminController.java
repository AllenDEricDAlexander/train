package top.atluofu.train.business.controller.admin;

import top.atluofu.train.common.context.LoginMemberContext;
import top.atluofu.train.common.resp.CommonResp;
import top.atluofu.train.common.resp.PageResp;
import top.atluofu.train.business.req.DailyTrainStationQueryReq;
import top.atluofu.train.business.req.DailyTrainStationSaveReq;
import top.atluofu.train.business.resp.DailyTrainStationQueryResp;
import top.atluofu.train.business.service.DailyTrainStationService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/daily-train-station")
public class DailyTrainStationAdminController {

    @Resource
    private DailyTrainStationService dailyTrainStationService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody DailyTrainStationSaveReq req) {
        dailyTrainStationService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<DailyTrainStationQueryResp>> queryList(@Valid DailyTrainStationQueryReq req) {
        PageResp<DailyTrainStationQueryResp> list = dailyTrainStationService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        dailyTrainStationService.delete(id);
        return new CommonResp<>();
    }

}
