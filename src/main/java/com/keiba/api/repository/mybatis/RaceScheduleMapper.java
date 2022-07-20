package com.keiba.api.repository.mybatis;

import com.keiba.api.domain.RaceSchedule;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * MyBatisによるRaceScheduleテーブルとのマッパーを表すインタフェース。
 */
@Mapper
public interface RaceScheduleMapper{

    List<RaceSchedule> find(int raceId);
}
