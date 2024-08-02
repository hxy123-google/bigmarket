package org.example.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: RaffleAwardEntity
 * Package: org.example.domain.strategy.model.entity
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/26 14:41
 * @Version 1.0
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RaffleAwardEntity {
    /** 策略ID */
    private Long strategyId;
    /** 奖品ID */
    private Integer awardId;
    /** 奖品对接标识 - 每一个都是一个对应的发奖策略 */
    private String awardKey;
    /** 奖品配置信息 */
    private String awardConfig;
    /** 奖品内容描述 */
    private String awardDesc;

}
