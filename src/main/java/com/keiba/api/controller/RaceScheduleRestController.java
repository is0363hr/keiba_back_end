package com.keiba.api.controller;

import com.keiba.api.domain.RaceScheduleList;
import com.keiba.api.domain.RaceSelector;
import com.keiba.api.service.RaceScheduleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RaceScheduleに関する操作を行うRestful Web APIのコントローラー実装。
 */
@RequestMapping("services/v1/schedules")
@RestController
public class RaceScheduleRestController {

    private static final Logger logger = LoggerFactory.getLogger(RaceScheduleRestController.class);

    private final RaceScheduleService service;

    public RaceScheduleRestController(RaceScheduleService service) {
        this.service = service;
    }

    /**
     * クエリパラメータによる複数件参照処理。
     *
     * @param selector クエリパラメータの「raceId」の値
     * @return 条件に合致したRaceScheduleデータリスト
     */
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public RaceScheduleList find(RaceSelector selector) {
        return this.service.find(selector);
    }
}
