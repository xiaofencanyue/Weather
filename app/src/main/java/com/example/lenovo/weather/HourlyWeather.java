package com.example.lenovo.weather;

/**
 * Created by lenovo on 2017/6/22.
 */
public class HourlyWeather {
    // 预测时间
    private String clock;
    // 温度
    private String tmp;
    // 降水概率
    private String pop;
    // 风力
    private String wind;

    public HourlyWeather(String clock, String tmp, String pop, String wind) {
        this.clock = clock;
        this.tmp = tmp;
        this.pop = pop;
        this.wind = wind;
    }

    public String getClock() {
        return clock;
    }

    public String getTmp() {
        return tmp;
    }

    public String getPop() {
        return pop;
    }

    public String getWind() {
        return wind;
    }
}
