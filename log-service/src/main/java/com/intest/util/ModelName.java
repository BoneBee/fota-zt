package com.intest.util;

public class ModelName {
    public static final String MODEL_PARTS_MESSAGE = "零件信息管理";
    public static final String MODEL_PARTS_TYPE = "零件类型";
    public static final String MODEL_CAR_MESSAGE = "车辆信息管理";
    public static final String MODEL_CAR_TYPE = "车型管理";
    public static final String MODEL_PARTS_CONFIG = "升级策略管理";


    public static final String MODEL_SYSTEM_ROLE = "角色管理";
    public static final String MODEL_TASKS_REVIEW = "审核流程管理";
    public static final String ACTION_TASKS_REVIEW_STATE = "修改审核流程状态";

    public static final String MODEL_TASK_MESSAGE = "任务信息管理";
    public static final String ACTION_TASK_MESSAGE_PUBLISH = "发布";
    public static final String ACTION_TASK_MESSAGE_CLOSE = "关闭任务";
    public static final String ACTION_TASK_MESSAGE_LOOK = "查看任务车辆";
    public static final String MODEL_TASK_REVIEW = "任务审核";


    public static final String MODEL_SYSTEM_USER = "账户管理";
    public static final String ACTION_SYSTEM_USER_REPLE = "重置密码";
    public static final String ACTION_SYSTEM_USER_ROLE = "查看权限";
    public static final String ACTION_SYSTEM_USER_STATE = "修改账户状态";

    public static final String MODEL_UPDATE_FILE = "升级包";
    public static final String ACTION_UPDATE_FILE_CANCLE = "取消发布";

    public static final String MODEL_VERSION_NEW = "原始包";
    public static final String ACTION_VERSION_NEW_DOWNLOAD = "原始包下载";
    public static final String MODEL_VERSION_PART = "零件包";
    public static final String ACTION_VERSION_PART_DOWNLOAD = "零件包下载";


    public static final String ACTION_CREATE = "新建";
    public static final String ACTION_UPDATE = "修改";
    public static final String ACTION_DELETE = "删除";


    public static String actionRemark(String action, String userName, int result) {
        String actionRemark = "";
        switch (action) {
            case "新建":
                actionRemark = "新建:新建“账户:" + userName + "“," + "结果:" + (result == 1 ? "成功" : "失败");
                break;
            case "编辑":
                actionRemark = "编辑:编辑“账户:" + userName + "“," + "结果:" + (result == 1 ? "成功" : "失败");
                break;
            case "删除":
                actionRemark = "删除:删除“账户:" + userName + "“," + "结果:" + (result == 1 ? "成功" : "失败");
                break;
            case "查看详情":
                actionRemark = "查看详情:查看“账户:" + userName + "“" ;
                break;
            case "查看权限":
                actionRemark = "查看权限:查看“账户:" + userName + "“" ;
                break;
            case "重置密码":
                actionRemark = "重置密码:重置“账户:" + userName + "“" ;
                break;
            case "取消发布":
                actionRemark = "取消发布:取消“账户:" + userName + "“" ;
                break;
            case "升级包制作":
                actionRemark = "升级包制作:制作“账户:" + userName + "“" ;
                break;
            case "获取任务车辆":
                actionRemark = "获取任务车辆:获取“账户:" + userName + "“" ;
                break;
            case "关闭任务":
                actionRemark = "关闭任务:关闭“账户:" + userName + "“" ;
                break;
            case "发布任务":
                actionRemark = "发布任务:发布“账户:" + userName + "“" ;
                break;
            case "零件包下载":
                actionRemark = "零件包下载:下载“账户:" + userName + "“" ;
                break;
            case "配置策略信息":
                actionRemark = "配置策略信息:配置“账户:" + userName + "“" ;
                break;
            case "原始包下载":
                actionRemark = "原始包下载:下载“账户:" + userName + "“" ;
                break;
        }
        return actionRemark;

    }
}
