package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.StrategyRule;

import java.util.List;

/**
 * ClassName: IStrategyRuleDao
 * Package: org.example.infrastructure.persistent.dao
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/11 15:40
 * @Version 1.0
 */
@Mapper
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();
    StrategyRule queryStrategyRule(StrategyRule strategyRuleReq);
    String queryStrategyRuleValue(StrategyRule strategyRule);
}
