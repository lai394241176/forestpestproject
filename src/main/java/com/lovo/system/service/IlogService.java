package com.lovo.system.service;


import com.lovo.system.bean.SysLog;

import java.util.List;
import java.util.Map;

public interface IlogService {
    /**
     * 根据日期查询日志记录
     *
     * @param map （起始日期，结束日期，分页起始行，分页显示行数）
     * @return List<SysLog>日志集合
     */
    public List<SysLog> getSysLog(Map<String, Object> map);

    /**
     * 获得总行数
     *
     * @param map （起始日期，结束日期）
     * @return 总行数
     */
    public int getintrowcount(Map<String, Object> map);
}
