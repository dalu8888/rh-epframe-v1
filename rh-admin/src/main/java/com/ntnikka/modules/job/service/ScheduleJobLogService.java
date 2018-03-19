
package com.ntnikka.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.ntnikka.modules.job.entity.ScheduleJobLogEntity;
import com.ntnikka.utils.PageUtils;

import java.util.Map;

/**
 * 定时任务日志
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
