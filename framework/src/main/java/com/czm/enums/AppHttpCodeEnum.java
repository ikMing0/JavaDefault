package com.czm.enums;

public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(200,"操作成功"),
    // 登录
    NEED_LOGIN(401,"需要登录后操作"),
    NO_OPERATOR_AUTH(403,"无权限操作"),
    SYSTEM_ERROR(500,"出现错误"),
    USERNAME_EXIST(501,"用户名已存在"),
    EMAIL_EXIST(503, "邮箱已存在"),
    NICKNAME_EXIST(503, "用户昵称已存在"),
    PHONENUMBER_EXIST(502,"手机号已存在"),
    REQUIRE_USERNAME(504, "必需填写用户名"),
    FILE_TYPE_ERROR(507, "图片格式错误，请选择png/jpg/jpeg"),
    REQUIRE_PASSWORD(534, "必须填写密码"),
    PARAMETER_ERROR(535,"参数错误"),
    USERID_ERROR(540,"用户ID不一致"),
    COMMENT_NOTNULL(536,"评论不能为空"),
    USER_NICKNAME_NOT_NULL(508, "必须填写用户昵称"),
    PASSWORD_NOT_NULL(537, "必须填写密码"),
    EMAIL_NOT_NULL(539, "必须填写邮箱"),
    LOGIN_ERROR(505,"用户名或密码错误");
    int code;
    String msg;

    AppHttpCodeEnum(int code, String errorMessage){
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}