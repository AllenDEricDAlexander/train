package top.atluofu.train.batch.feign;


import org.springframework.stereotype.Component;
import top.atluofu.train.common.resp.CommonResp;

import java.util.Date;

@Component
public class BusinessFeignFallback implements BusinessFeign {
    @Override
    public String hello() {
        return "Fallback";
    }

    @Override
    public CommonResp<Object> genDaily(Date date) {
        return null;
    }
}
