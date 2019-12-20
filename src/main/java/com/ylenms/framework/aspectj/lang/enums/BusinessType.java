package com.ylenms.framework.aspectj.lang.enums;

/**
 * 业务操作类型
 * 
 * @author ylenms
 *
 */
public enum BusinessType
{
    /**
     * 其它
     */
    OTHER,

    /**
     * 新增
     */
    INSERT,

    /**
     * 修改
     */
    UPDATE,

    /**
     * 删除
     */
    DELETE,

    /**
     * 授权
     */
    GRANT,

    /**
     * 导出
     */
    EXPORT,

    /**
     * 导入
     */
    IMPORT,

    /**
     * 强退
     */
    FORCE,

    /**
     * 生成代码
     */
    GENCODE,
    
    /**
     * 清空数据
     */
    CLEAN,
    /**
     * 配置
     */
    CONFIG,
    /**
     * 重启
     */
    REBOOT,
    /**
     * 关机
     */
    SHUTDOWN,
}
