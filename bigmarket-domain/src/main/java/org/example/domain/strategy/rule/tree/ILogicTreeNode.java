package org.example.domain.strategy.rule.tree;

import org.example.domain.strategy.rule.tree.factory.DefaultTreeFactory;

/**
 * ClassName: ILogicTreeNode
 * Package: org.example.domain.strategy.rule.tree
 * Description:
 *
 * @Author Hxy
 * @Create 2024/8/9 15:12
 * @Version 1.0
 */
public interface ILogicTreeNode {
    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId);

}
