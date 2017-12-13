package com.jd.containerfs.dto;


import com.jd.containerfs.util.BaseResult;

/**
 * Created by lixiaoping3 on 17-11-22.
 */
public class MetaNodeResultDto extends BaseResult {

    private MetaNodeDto metaNode;

    public MetaNodeDto getMetaNode() {
        return metaNode;
    }

    public void setMetaNode(MetaNodeDto metaNode) {
        this.metaNode = metaNode;
    }

}
