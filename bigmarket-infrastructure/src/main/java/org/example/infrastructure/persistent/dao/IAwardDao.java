package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Award;

import java.util.List;

/**
 * ClassName: IAwardDao
 * Package: org.example.infrastructure.persistent.dao
 * Description:
 *
 * @Author Hxy
 * @Create 2024/7/7 15:41
 * @Version 1.0
 */
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();
}
