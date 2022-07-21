package com.keiba.api.repository;

import com.keiba.api.domain.RaceSchedule;
import com.keiba.api.domain.RaceSelector;
import com.keiba.api.repository.mybatis.RaceScheduleMapper;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * RaceScheduleRepositoryのMyBatisを利用した実装クラス。
 */
@Repository
public class RaceScheduleRepositoryImpl implements RaceScheduleRepository {

    private static final Logger logger = LoggerFactory.getLogger(RaceScheduleRepositoryImpl.class);

    private final SqlSession sqlSession;

    public RaceScheduleRepositoryImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<RaceSchedule> find(RaceSelector selector) {
        return this.sqlSession.getMapper(RaceScheduleMapper.class).find(selector);
    }
}
