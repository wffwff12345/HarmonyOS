package com.ruoyi.advertisement.admin.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 设备对象 adv-device
 * 
 * @author ruoyi
 * @date 2024-08-27
 */
public class AdvDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private Long id;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String deviceName;

    /** 设备MAC地址 */
    @Excel(name = "设备MAC地址")
    private String deviceMac;

    /** 设备状态码 */
    @Excel(name = "设备状态码")
    private String statusCode;

    /** 设备图片内容改变码 */
    @Excel(name = "设备图片内容改变码")
    private String changeCode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeviceName(String deviceName) 
    {
        this.deviceName = deviceName;
    }

    public String getDeviceName() 
    {
        return deviceName;
    }
    public void setDeviceMac(String deviceMac) 
    {
        this.deviceMac = deviceMac;
    }

    public String getDeviceMac() 
    {
        return deviceMac;
    }
    public void setStatusCode(String statusCode) 
    {
        this.statusCode = statusCode;
    }

    public String getStatusCode() 
    {
        return statusCode;
    }
    public void setChangeCode(String changeCode) 
    {
        this.changeCode = changeCode;
    }

    public String getChangeCode() 
    {
        return changeCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deviceName", getDeviceName())
            .append("deviceMac", getDeviceMac())
            .append("statusCode", getStatusCode())
            .append("changeCode", getChangeCode())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
