package com.fox.model;

public class TblComDicdtl {
    private Long id;

    private String dataValue;

    private String dataSubvalue;

    private String dataSubname;

    private String preDataValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataValue() {
        return dataValue;
    }

    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataSubvalue() {
        return dataSubvalue;
    }

    public void setDataSubvalue(String dataSubvalue) {
        this.dataSubvalue = dataSubvalue;
    }

    public String getDataSubname() {
        return dataSubname;
    }

    public void setDataSubname(String dataSubname) {
        this.dataSubname = dataSubname;
    }

    public String getPreDataValue() {
        return preDataValue;
    }

    public void setPreDataValue(String preDataValue) {
        this.preDataValue = preDataValue;
    }
}