package com.uniform.datacollection.model;

public class Metadata {
    private Integer id;

    private String metadataName;

    private String metadataDefine;

    private String metadataType;

    private Integer metadataLength;

    private Integer sequenceId;

    private Integer interId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetadataName() {
        return metadataName;
    }

    public void setMetadataName(String metadataName) {
        this.metadataName = metadataName;
    }

    public String getMetadataDefine() {
        return metadataDefine;
    }

    public void setMetadataDefine(String metadataDefine) {
        this.metadataDefine = metadataDefine;
    }

    public String getMetadataType() {
        return metadataType;
    }

    public void setMetadataType(String metadataType) {
        this.metadataType = metadataType;
    }

    public Integer getMetadataLength() {
        return metadataLength;
    }

    public void setMetadataLength(Integer metadataLength) {
        this.metadataLength = metadataLength;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public Integer getInterId() {
        return interId;
    }

    public void setInterId(Integer interId) {
        this.interId = interId;
    }
}