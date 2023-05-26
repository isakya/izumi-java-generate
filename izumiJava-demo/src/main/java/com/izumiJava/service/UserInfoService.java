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
	Long findCountByParam(UserInfo query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfo> findCountByParam(UserInfoQuery query);

	/**
	 * 新增
	 */
	Long add(UserInfo bean);

	/**
	 * 批量新增
	 */
	Long addBatch(List<UserInfo> listBean);

	/**
	 * 批量新增或修改
	 */
	Long addOrUpdateBatch(List<UserInfo> listBean);
	/**
	 * 根据UserId查询
	 */
	UserInfo getByUserId(Integer userId);

	/**
	 * 根据UserId更新
	 */
	Long updateByUserId(UserInfo bean, Integer userId);

	/**
	 * 根据UserId删除
	 */
	Long deleteByUserId(Integer userId);

	/**
	 * 根据NickName查询
	 */
	UserInfo getByNickName(String nickName);

	/**
	 * 根据NickName更新
	 */
	Long updateByNickName(UserInfo bean, String nickName);

	/**
	 * 根据NickName删除
	 */
	Long deleteByNickName(String nickName);

	/**
	 * 根据Email查询
	 */
	UserInfo getByEmail(String email);

	/**
	 * 根据Email更新
	 */
	Long updateByEmail(UserInfo bean, String email);

	/**
	 * 根据Email删除
	 */
	Long deleteByEmail(String email);

	/**
	 * 根据QqOpenId查询
	 */
	UserInfo getByQqOpenId(String qqOpenId);

	/**
	 * 根据QqOpenId更新
	 */
	Long updateByQqOpenId(UserInfo bean, String qqOpenId);

	/**
	 * 根据QqOpenId删除
	 */
	Long deleteByQqOpenId(String qqOpenId);

}