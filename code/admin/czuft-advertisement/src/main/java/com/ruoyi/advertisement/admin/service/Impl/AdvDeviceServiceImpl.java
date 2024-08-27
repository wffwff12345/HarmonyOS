package com.ruoyi.advertisement.admin.service.Impl;

import java.util.List;

import com.ruoyi.advertisement.admin.domain.AdvDevice;
import com.ruoyi.advertisement.admin.mapper.AdvDeviceMapper;
import com.ruoyi.advertisement.admin.service.IAdvDeviceService;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-27
 */
@Service
public class AdvDeviceServiceImpl implements IAdvDeviceService
{
    @Resource
    private AdvDeviceMapper advDeviceMapper;

    /**
     * 查询设备
     * 
     * @param id 设备主键
     * @return 设备
     */
    @Override
    public AdvDevice selectAdvDeviceById(Long id)
    {
        return advDeviceMapper.selectAdvDeviceById(id);
    }

    /**
     * 查询设备列表
     * 
     * @param advDevice 设备
     * @return 设备
     */
    @Override
    public List<AdvDevice> selectAdvDeviceList(AdvDevice advDevice)
    {
        return advDeviceMapper.selectAdvDeviceList(advDevice);
    }

    /**
     * 新增设备
     * 
     * @param advDevice 设备
     * @return 结果
     */
    @Override
    public int insertAdvDevice(AdvDevice advDevice)
    {
        advDevice.setCreateTime(DateUtils.getNowDate());
        return advDeviceMapper.insertAdvDevice(advDevice);
    }

    /**
     * 修改设备
     * 
     * @param advDevice 设备
     * @return 结果
     */
    @Override
    public int updateAdvDevice(AdvDevice advDevice)
    {
        advDevice.setUpdateTime(DateUtils.getNowDate());
        return advDeviceMapper.updateAdvDevice(advDevice);
    }

    /**
     * 批量删除设备
     * 
     * @param ids 需要删除的设备主键
     * @return 结果
     */
    @Override
    public int deleteAdvDeviceByIds(Long[] ids)
    {
        return advDeviceMapper.deleteAdvDeviceByIds(ids);
    }

    /**
     * 删除设备信息
     * 
     * @param id 设备主键
     * @return 结果
     */
    @Override
    public int deleteAdvDeviceById(Long id)
    {
        return advDeviceMapper.deleteAdvDeviceById(id);
    }
}
