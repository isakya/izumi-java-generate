package com.izumiJava.service;

import com.izumiJava.entity.vo.PaginationResultVO;
import com.izumiJava.entity.po.UserInfo;
import com.izumiJava.entity.query.UserInfoQuery;

import java.util.List;

/**
 * @Description:用户信息Service
 * @author:izumi
 * @Date:2023/05/27
 */
public interface UserInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<UserInfo> findListByParam(UserInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(UserInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query);

	/**
	 * 新增
	 */
	Integer add(UserInfo bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<UserInfo> listBean);

	/**
	 * 批量新增或修改
	 */
	Integer addOrUpdateBatch(List<UserInfo> listBean);
	/**
	 * 根据UserId查询
	 */
	UserInfo getUserInfoByUserId(Integer userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateUserInfoByUserId(UserInfo bean, Integer userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteUserInfoByUserId(Integer userId);

	/**
	 * 根据NickName查询
	 */
	UserInfo getUserInfoByNickName(String nickName);

	/**
	 * 根据NickName更新
	 */
	Integer updateUserInfoByNickName(UserInfo bean, String nickName);

	/**
	 * 根据NickName删除
	 */
	Integer deleteUserInfoByNickName(String nickName);

	/**
	 * 根据Email查询
	 */
	UserInfo getUserInfoByEmail(String email);

	/**
	 * 根据Email更新
	 */
	Integer updateUserInfoByEmail(UserInfo bean, String email);

	/**
	 * 根据Email删除
	 */
	Integer deleteUserInfoByEmail(String email);

	/**
	 * 根据QqOpenId查询
	 */
	UserInfo getUserInfoByQqOpenId(String qqOpenId);

	/**
	 * 根据QqOpenId更新
	 */
	Integer updateUserInfoByQqOpenId(UserInfo bean, String qqOpenId);

	/**
	 * 根据QqOpenId删除
	 */
	Integer deleteUserInfoByQqOpenId(String qqOpenId);

}