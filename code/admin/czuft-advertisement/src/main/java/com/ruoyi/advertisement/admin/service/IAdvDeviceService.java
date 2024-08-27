package com.ruoyi.advertisement.admin.service;

import com.ruoyi.advertisement.admin.domain.AdvDevice;

import java.util.List;

/**
 * 设备Service接口
 * 
 * @author ruoyi
 * @date 2024-08-27
 */
public interface IAdvDeviceService 
{
    /**
     * 查询设备
     * 
     * @param id 设备主键
     * @return 设备
     */
    public AdvDevice selectAdvDeviceById(Long id);

    /**
     * 查询设备列表
     * 
     * @param advDevice 设备
     * @return 设备集合
     */
    public List<AdvDevice> selectAdvDeviceList(AdvDevice advDevice);

    /**
     * 新增设备
     * 
     * @param advDevice 设备
     * @return 结果
     */
    public int insertAdvDevice(AdvDevice advDevice);

    /**
     * 修改设备
     * 
     * @param advDevice 设备
     * @return 结果
     */
    public int updateAdvDevice(AdvDevice advDevice);

    /**
     * 批量删除设备
     * 
     * @param ids 需要删除的设备主键集合
     * @return 结果
     */
    public int deleteAdvDeviceByIds(Long[] ids);

    /**
     * 删除设备信息
     * 
     * @param id 设备主键
     * @return 结果
     */
    public int deleteAdvDeviceById(Long id);
}
