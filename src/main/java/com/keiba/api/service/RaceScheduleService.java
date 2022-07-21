package com.keiba.api.service;

import com.keiba.api.domain.RaceScheduleList;
import com.keiba.api.domain.RaceSelector;

/**
 * RaceScheduleドメインオブジェクトに関する処理を行うモジュールを表すインタフェース。
 */
public interface RaceScheduleService {

    /**
     * クエリパラメータによる複数件参照処理。
     *
     * @param selector 検索条件
     * @return 条件に合致したレース日程のデータリスト
     */
    RaceScheduleList find(RaceSelector selector);
}
