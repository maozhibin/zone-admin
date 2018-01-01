package com.cunyun.zoneadmin.common;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>文件名称：LoggerUtil.java</p> <p>文件描述：</p> <p>版权所有： 版权所有(C)2016-2099</p> <p>公   司： 优行科技 </p>
 * <p>内容摘要： </p> <p>其他说明： </p> <p>完成日期：2016年12月16日</p>
 *
 * @author liuke1@geely.com
 * @version 1.0
 */
public final class LoggerUtil {

  public static final Logger ERROR = LoggerFactory.getLogger("ERROR");

  public static final Logger EXCEPTION = LoggerFactory.getLogger("EXCEPTION");

  public static final Logger MONITOR = LoggerFactory.getLogger("MONITOR");

  public static final Logger MESSAGE = LoggerFactory.getLogger("MESSAGE");

  public static final Logger CACHE = LoggerFactory.getLogger("CACHE");

  public static final Logger COMMON = LoggerFactory.getLogger("COMMON");

}
