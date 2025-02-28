package com.example.andersson.musicapp.AsyncUpdate;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "sendclass")
public class SendClass {

    @Element
    private String instrumentName;
    @Element
    private String data;
    @Element
    private String volume;
    @Element
    private Integer bars;
    @Element
    private Boolean hasData;

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getBars() {
        return bars;
    }

    public void setBars(Integer bars) {
        this.bars = bars;
    }

    public Boolean getHasData() {
        return hasData;
    }

    public void setHasData(Boolean hasData) {
        this.hasData = hasData;
    }


}