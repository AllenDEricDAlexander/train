package top.atluofu.train.member.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.atluofu.train.member.mapper.MemberMapper;

/**
 * @ClassName: MemberService
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-16:41
 * @Version: 1.0
 */
@Service
public class MemberService {
    @Resource
    private MemberMapper memberMapper;

    public int count() {
        return Math.toIntExact(memberMapper.countByExample(null));
    }
}
