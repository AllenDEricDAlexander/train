package top.atluofu.train.batch.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.atluofu.train.common.resp.CommonResp;

import java.util.Date;

//@FeignClient(value = "business", fallback = BusinessFeignFallback.class)
 @FeignClient(name = "business", url = "http://127.0.0.1:8082/")
public interface BusinessFeign {

    @GetMapping("/business/demo/hello")
    String hello();

    @GetMapping("/business/admin/daily-train/gen-daily/{date}")
    CommonResp<Object> genDaily(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date);
}
