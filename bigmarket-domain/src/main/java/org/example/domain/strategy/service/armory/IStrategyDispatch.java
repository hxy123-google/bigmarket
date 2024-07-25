package org.example.domain.strategy.service.armory;

/**
 * ClassName: IStrategyDispatch
 * Package: org.example.domain.strategy.service.armory
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/24 22:14
 * @Version 1.0
 */
public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);
    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
