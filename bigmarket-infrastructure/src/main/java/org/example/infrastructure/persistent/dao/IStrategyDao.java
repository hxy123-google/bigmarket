package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * ClassName: IStrategyDao
 * Package: org.example.infrastructure.persistent.dao
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/11 15:39
 * @Version 1.0
 */
@Mapper
public interface  IStrategyDao{
    List<Strategy> queryStrategyList();
    Strategy queryStrategyByStrategyId(Long strategyId);
}
