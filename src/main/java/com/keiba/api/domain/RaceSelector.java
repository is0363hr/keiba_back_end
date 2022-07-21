package com.keiba.api.domain;

/**
 * レースの検索条件を格納するドメインオブジェクト。
 */
public class RaceSelector {
    private Integer raceId;

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }
}
