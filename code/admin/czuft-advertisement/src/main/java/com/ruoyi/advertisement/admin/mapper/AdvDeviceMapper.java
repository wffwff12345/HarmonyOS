package com.ruoyi.advertisement.admin.mapper;

import com.ruoyi.advertisement.admin.domain.AdvDevice;

import java.util.List;

/**
 * 设备Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-27
 */
public interface AdvDeviceMapper 
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
     * 删除设备
     * 
     * @param id 设备主键
     * @return 结果
     */
    public int deleteAdvDeviceById(Long id);

    /**
     * 批量删除设备
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAdvDeviceByIds(Long[] ids);
}
