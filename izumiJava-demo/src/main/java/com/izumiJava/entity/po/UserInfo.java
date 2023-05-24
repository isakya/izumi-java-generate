package com.izumiJava.entity.po;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.izumiJava.enums.DateTimePatternEnum;
import com.izumiJava.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @Description:用户信息
 * @author:izumi
 * @Date:2023/05/24
 */
public class UserInfo implements Serializable {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * qqOpenId
     */
    private String qqOpenId;

    /**
     * qq头像
     */
    private String qqAvatar;

    /**
     * 密码(md5)
     */
    private String password;

    /**
     * 加入时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joinTime;

    /**
     * 最后一次登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    /**
     * 状态(0: 禁用 1: 启用)
     */
    @JsonIgnore
    private Integer status;

    /**
     * 使用空间，单位byte
     */
    private Long useSpace;

    /**
     * 总空间
     */
    private Long totalSpace;

    /**
     * 是否删除(0：删除 1：正常)
     */
    private Integer isDel;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String setUserId() {
        return this.userId;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String setNickName() {
        return this.nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String setEmail() {
        return this.email;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String setQqOpenId() {
        return this.qqOpenId;
    }

    public void setQqAvatar(String qqAvatar) {
        this.qqAvatar = qqAvatar;
    }

    public String setQqAvatar() {
        return this.qqAvatar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String setPassword() {
        return this.password;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date setJoinTime() {
        return this.joinTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date setLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer setStatus() {
        return this.status;
    }

    public void setUseSpace(Long useSpace) {
        this.useSpace = useSpace;
    }

    public Long setUseSpace() {
        return this.useSpace;
    }

    public void setTotalSpace(Long totalSpace) {
        this.totalSpace = totalSpace;
    }

    public Long setTotalSpace() {
        return this.totalSpace;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer setIsDel() {
        return this.isDel;
    }

    @Override
    public String toString() {
        return "用户ID:" + (userId == null ? "空" : userId) + ",昵称:" + (nickName == null ? "空" : nickName) + ",邮箱:" + (email == null ? "空" : email) + ",qqOpenId:" + (qqOpenId == null ? "空" : qqOpenId) + ",qq头像:" + (qqAvatar == null ? "空" : qqAvatar) + ",密码(md5):" + (password == null ? "空" : password) + ",加入时间:" + (joinTime == null ? "空" : DateUtils.format(joinTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",最后一次登录时间:" + (lastLoginTime == null ? "空" : DateUtils.format(lastLoginTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",状态(0: 禁用 1: 启用):" + (status == null ? "空" : status) + ",使用空间，单位byte:" + (useSpace == null ? "空" : useSpace) + ",总空间:" + (totalSpace == null ? "空" : totalSpace) + ",是否删除(0：删除 1：正常):" + (isDel == null ? "空" : isDel);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setJoinTime(new Date());
        userInfo.setLastLoginTime(new Date());
        System.out.println(userInfo.toString());
    }
}