package org.example.domain.strategy.rule.chain;

/**
 * ClassName: ILogicChain
 * Package: org.example.domain.strategy.rule.chain
 * Description:
 *
 * @Author Hxy
 * @Create 2024/8/6 14:51
 * @Version 1.0
 */
public interface ILogicChain extends ILogicChainArmory{
    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    Integer logic(String userId, Long strategyId);


}
