package com.jd.containerfs.vo;


import com.jd.containerfs.util.BaseResult;

/**
 * Created by lixiaoping3 on 17-11-20.
 */
public class ClusterInfoResultVO extends BaseResult {

    private ClusterInfoVO clusterInfo;

    public ClusterInfoVO getClusterInfo() {
        return clusterInfo;
    }

    public void setClusterInfo(ClusterInfoVO clusterInfo) {
        this.clusterInfo = clusterInfo;
    }

}
