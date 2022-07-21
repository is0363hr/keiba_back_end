package com.keiba.api.repository;

import com.keiba.api.domain.RaceSchedule;
import com.keiba.api.domain.RaceSelector;
import java.util.List;

public interface RaceScheduleRepository {

    /**
     * クエリパラメータによる複数件参照処理。
     * userIdを引数にして、そのユーザの参加中のプライベート、パブリックのプランを返す
     *
     * @param raceSelector 検索条件
     * @return 条件に合致したレース日程のデータリスト
     */
    List<RaceSchedule> find(RaceSelector raceSelector);
}
