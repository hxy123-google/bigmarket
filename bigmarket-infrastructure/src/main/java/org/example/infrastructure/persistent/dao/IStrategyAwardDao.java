package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.StrategyAward;

import java.util.List;

/**
 * ClassName: IStrategyAwardDao
 * Package: org.example.infrastructure.persistent.dao
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/11 15:38
 * @Version 1.0
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();
    List<StrategyAward> queryStrategyAwardListByStrategyId(Long StrategyId);
}
