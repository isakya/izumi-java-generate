package com.izumiJava.mappers;

import java.io.Serializable;
import org.apache.ibatis.annotations.Param;
/**
 * @Description:用户信息Mapper
 * @author:izumi
 * @Date:2023/05/27
 */
public interface UserInfoMapper<T, P> extends BaseMapper {
	/**
	 * 根据UserId查询
	 */
	T selectByUserId(@Param("userId") Integer userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateByUserId(@Param("bean") T t, @Param("userId") Integer userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteByUserId(@Param("userId") Integer userId);

	/**
	 * 根据NickName查询
	 */
	T selectByNickName(@Param("nickName") String nickName);

	/**
	 * 根据NickName更新
	 */
	Integer updateByNickName(@Param("bean") T t, @Param("nickName") String nickName);

	/**
	 * 根据NickName删除
	 */
	Integer deleteByNickName(@Param("nickName") String nickName);

	/**
	 * 根据Email查询
	 */
	T selectByEmail(@Param("email") String email);

	/**
	 * 根据Email更新
	 */
	Integer updateByEmail(@Param("bean") T t, @Param("email") String email);

	/**
	 * 根据Email删除
	 */
	Integer deleteByEmail(@Param("email") String email);

	/**
	 * 根据QqOpenId查询
	 */
	T selectByQqOpenId(@Param("qqOpenId") String qqOpenId);

	/**
	 * 根据QqOpenId更新
	 */
	Integer updateByQqOpenId(@Param("bean") T t, @Param("qqOpenId") String qqOpenId);

	/**
	 * 根据QqOpenId删除
	 */
	Integer deleteByQqOpenId(@Param("qqOpenId") String qqOpenId);

}