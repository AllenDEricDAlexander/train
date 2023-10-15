package top.atluofu.train.member.service;

import cn.hutool.core.util.ObjectUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.atluofu.train.common.exception.BusinessException;
import top.atluofu.train.common.exception.BusinessExceptionEnum;
import top.atluofu.train.common.util.SnowUtil;
import top.atluofu.train.member.domain.Member;
import top.atluofu.train.member.domain.MemberExample;
import top.atluofu.train.member.mapper.MemberMapper;
import top.atluofu.train.member.req.MemberLoginReq;
import top.atluofu.train.member.req.MemberRegisterReq;
import top.atluofu.train.member.req.MemberSendCodeReq;
import top.atluofu.train.member.resp.MemberLoginResp;

import java.util.List;

/**
 * @ClassName: MemberService
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-16:41
 * @Version: 1.0
 */
@Service
@Slf4j
public class MemberService {
    @Resource
    private MemberMapper memberMapper;

    public int count() {
        return Math.toIntExact(memberMapper.countByExample(null));
    }

    public long register(MemberRegisterReq req) {
        String mobile = req.getMobile();
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        List<Member> members = memberMapper.selectByExample(memberExample);

        if (ObjectUtil.isNull(members)) {
            throw new BusinessException(BusinessExceptionEnum.MEMBER_MOBILE_EXIST);
        }

        Member member = new Member();
        member.setId(SnowUtil.getSnowflakeNextId());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return member.getId();
    }

    public void sendCode(MemberSendCodeReq req) {
    }

    public MemberLoginResp login(MemberLoginReq req) {
        return null;
    }
}
