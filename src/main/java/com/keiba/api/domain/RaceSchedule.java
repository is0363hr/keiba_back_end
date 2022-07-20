package com.keiba.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

/**
 * レース日程を表すドメインオブジェクト
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RaceSchedule {

    /**
     * Id
     */
    private int raceId;

    /**
     * レースの日付
     */
    private Date raceDate;

    /**
     * レース名
     */
    private String raceName;

    /**
     * レース詳細のリンク
     */
    private String raceDetailLink;

    /**
     * レースのグレード
     */
    private String raceGrade;

    /**
     * レース場
     */
    private String raceCity;

    /**
     * レースの距離
     */
    private String raceDistance;

    /**
     * レース条件
     */
    private String raceTerms;

    /**
     * レースに出場する馬の重さ
     */
    private String raceWeight;

    /**
     * データ取得日
     */
    private Date registerDate;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public Date getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(Date raceDate) {
        this.raceDate = raceDate;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceDetailLink() {
        return raceDetailLink;
    }

    public void setRaceDetailLink(String raceDetailLink) {
        this.raceDetailLink = raceDetailLink;
    }

    public String getRaceGrade() {
        return raceGrade;
    }

    public void setRaceGrade(String raceGrade) {
        this.raceGrade = raceGrade;
    }

    public String getRaceCity() {
        return raceCity;
    }

    public void setRaceCity(String raceCity) {
        this.raceCity = raceCity;
    }

    public String getRaceDistance() {
        return raceDistance;
    }

    public void setRaceDistance(String raceDistance) {
        this.raceDistance = raceDistance;
    }

    public String getRaceTerms() {
        return raceTerms;
    }

    public void setRaceTerms(String raceTerms) {
        this.raceTerms = raceTerms;
    }

    public String getRaceWeight() {
        return raceWeight;
    }

    public void setRaceWeight(String raceWeight) {
        this.raceWeight = raceWeight;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
