package cn.harry.sys.dao;

import cn.harry.sys.entity.SysSmsLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 短信日志表
 *
 * @author honghh
 * Date 2019-10-12 10:55:44
 * Copyright (C) www.tech-harry.cn
 */
@Mapper
public interface SysSmsLogDao extends BaseMapper<SysSmsLog> {
	
}
