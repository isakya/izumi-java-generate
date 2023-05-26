package com.izumiJava.entity.query;

import java.util.Date;


/**
 * @Description:用户信息查询对象
 * @author:izumi
 * @Date:2023/05/27
 */
public class UserInfoQuery extends BaseQuery {
	/**
	 * 用户ID
	 */
	private Integer userId;

	/**
	 * 昵称
	 */
	private String nickName;

	private String nickNameFuzzy;

	/**
	 * 邮箱
	 */
	private String email;

	private String emailFuzzy;

	/**
	 * qqOpenId
	 */
	private String qqOpenId;

	private String qqOpenIdFuzzy;

	/**
	 * qq头像
	 */
	private String qqAvatar;

	private String qqAvatarFuzzy;

	/**
	 * 密码(md5)
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 加入时间
	 */
	private Date joinTime;

	private String joinTimeEnd;

	private String joinTimeStart;

	/**
	 * 最后一次登录时间
	 */
	private Date lastLoginTime;

	private String lastLoginTimeEnd;

	private String lastLoginTimeStart;

	/**
	 * 状态(0: 禁用 1: 启用)
	 */
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

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer setUserId() {
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

	public void setNickNameFuzzy(String nickNameFuzzy) {
		this.nickNameFuzzy = nickNameFuzzy;
	}

	public String setNickNameFuzzy() {
		return this.nickNameFuzzy;
	}

	public void setEmailFuzzy(String emailFuzzy) {
		this.emailFuzzy = emailFuzzy;
	}

	public String setEmailFuzzy() {
		return this.emailFuzzy;
	}

	public void setQqOpenIdFuzzy(String qqOpenIdFuzzy) {
		this.qqOpenIdFuzzy = qqOpenIdFuzzy;
	}

	public String setQqOpenIdFuzzy() {
		return this.qqOpenIdFuzzy;
	}

	public void setQqAvatarFuzzy(String qqAvatarFuzzy) {
		this.qqAvatarFuzzy = qqAvatarFuzzy;
	}

	public String setQqAvatarFuzzy() {
		return this.qqAvatarFuzzy;
	}

	public void setPasswordFuzzy(String passwordFuzzy) {
		this.passwordFuzzy = passwordFuzzy;
	}

	public String setPasswordFuzzy() {
		return this.passwordFuzzy;
	}

	public void setJoinTimeEnd(String joinTimeEnd) {
		this.joinTimeEnd = joinTimeEnd;
	}

	public String setJoinTimeEnd() {
		return this.joinTimeEnd;
	}

	public void setJoinTimeStart(String joinTimeStart) {
		this.joinTimeStart = joinTimeStart;
	}

	public String setJoinTimeStart() {
		return this.joinTimeStart;
	}

	public void setLastLoginTimeEnd(String lastLoginTimeEnd) {
		this.lastLoginTimeEnd = lastLoginTimeEnd;
	}

	public String setLastLoginTimeEnd() {
		return this.lastLoginTimeEnd;
	}

	public void setLastLoginTimeStart(String lastLoginTimeStart) {
		this.lastLoginTimeStart = lastLoginTimeStart;
	}

	public String setLastLoginTimeStart() {
		return this.lastLoginTimeStart;
	}

}