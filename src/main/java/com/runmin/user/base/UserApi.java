package com.runmin.user.base;

/**
 * @Author: Buffett
 * @Date: 2018/8/14 11:01
 */
/**
 * 系统对外提供接口统一配置
 *
 * 定义规则为：
 *  1.分类型模块，一个类型操作，就是一个静态内部类。
 *  2.没有模块下面，必须有一个base，用于类级别的 RequestMapping 例如：/group
 *  3.操作：新增：add、列表：list、详情：detail、修改：update、删除：delete  例如：/add
 *  4.场景： 相同参数列表，返回参数相同，视为同一场景。例如：在猪的批次下，获取该批次提醒列表 /AddRemindRequest/list/group?xx=xx
 *
 *
 */
public class UserApi {

    public static final class User{
        public static final String BASE = "/user";

        public static final String TEST = "/test";
    }


}
