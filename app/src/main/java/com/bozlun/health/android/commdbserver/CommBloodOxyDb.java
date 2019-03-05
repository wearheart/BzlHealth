package com.bozlun.health.android.commdbserver;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Admin
 * Date 2019/2/28
 * 血氧上传
 */
public class  CommBloodOxyDb extends LitePalSupport {


    /**
     * "userid": "userId",
     * 		"devicecode": "devicecode",
     * 		"avgbloodoxygen": 132,
     * 		"rtc": "2019-02-13",
     * 		"minbloodoxygen": 46,
     * 		"maxbloodoxygen": 155
     */
    /**
     * userId
     */
    private String userid;

    /**
     * mac地址
     */
    private String devicecode;

    /**
     * 日期yyyy-MM-dd格式
     */
    private String rtc;

    /**
     * 高压
     */
    private int maxbloodoxygen;

    /**
     * 低压
     */
    private int minbloodoxygen;

    /**
     * 平均值
     */
    private int avgbloodoxygen;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDevicecode() {
        return devicecode;
    }

    public void setDevicecode(String devicecode) {
        this.devicecode = devicecode;
    }

    public String getRtc() {
        return rtc;
    }

    public void setRtc(String rtc) {
        this.rtc = rtc;
    }

    public int getMaxbloodoxygen() {
        return maxbloodoxygen;
    }

    public void setMaxbloodoxygen(int maxbloodoxygen) {
        this.maxbloodoxygen = maxbloodoxygen;
    }

    public int getMinbloodoxygen() {
        return minbloodoxygen;
    }

    public void setMinbloodoxygen(int minbloodoxygen) {
        this.minbloodoxygen = minbloodoxygen;
    }

    public int getAvgbloodoxygen() {
        return avgbloodoxygen;
    }

    public void setAvgbloodoxygen(int avgbloodoxygen) {
        this.avgbloodoxygen = avgbloodoxygen;
    }

    @Override
    public String toString() {
        return "CommBloodOxyDb{" +
                "userid='" + userid + '\'' +
                ", devicecode='" + devicecode + '\'' +
                ", rtc='" + rtc + '\'' +
                ", maxbloodoxygen=" + maxbloodoxygen +
                ", minbloodoxygen=" + minbloodoxygen +
                ", avgbloodoxygen=" + avgbloodoxygen +
                '}';
    }
}
