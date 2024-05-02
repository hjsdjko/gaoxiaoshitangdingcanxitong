package com.entity.view;

import com.entity.CaipinOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("caipin_order")
public class CaipinOrderView extends CaipinOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 caipin
			/**
			* 菜品名称
			*/
			private String caipinName;
			/**
			* 菜品类型
			*/
			private Integer caipinTypes;
				/**
				* 菜品类型的值
				*/
				private String caipinValue;
			/**
			* 菜品缩略图
			*/
			private String caipinPhoto;
			/**
			* 菜品单价
			*/
			private Integer caipinNewMoney;
			/**
			* 菜品详情
			*/
			private String caipinContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuNumber;
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;

	public CaipinOrderView() {

	}

	public CaipinOrderView(CaipinOrderEntity caipinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, caipinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set caipin
					/**
					* 获取： 菜品名称
					*/
					public String getCaipinName() {
						return caipinName;
					}
					/**
					* 设置： 菜品名称
					*/
					public void setCaipinName(String caipinName) {
						this.caipinName = caipinName;
					}
					/**
					* 获取： 菜品类型
					*/
					public Integer getCaipinTypes() {
						return caipinTypes;
					}
					/**
					* 设置： 菜品类型
					*/
					public void setCaipinTypes(Integer caipinTypes) {
						this.caipinTypes = caipinTypes;
					}


						/**
						* 获取： 菜品类型的值
						*/
						public String getCaipinValue() {
							return caipinValue;
						}
						/**
						* 设置： 菜品类型的值
						*/
						public void setCaipinValue(String caipinValue) {
							this.caipinValue = caipinValue;
						}
					/**
					* 获取： 菜品缩略图
					*/
					public String getCaipinPhoto() {
						return caipinPhoto;
					}
					/**
					* 设置： 菜品缩略图
					*/
					public void setCaipinPhoto(String caipinPhoto) {
						this.caipinPhoto = caipinPhoto;
					}
					/**
					* 获取： 菜品单价
					*/
					public Integer getCaipinNewMoney() {
						return caipinNewMoney;
					}
					/**
					* 设置： 菜品单价
					*/
					public void setCaipinNewMoney(Integer caipinNewMoney) {
						this.caipinNewMoney = caipinNewMoney;
					}
					/**
					* 获取： 菜品详情
					*/
					public String getCaipinContent() {
						return caipinContent;
					}
					/**
					* 设置： 菜品详情
					*/
					public void setCaipinContent(String caipinContent) {
						this.caipinContent = caipinContent;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuNumber() {
						return yonghuNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuNumber(String yonghuNumber) {
						this.yonghuNumber = yonghuNumber;
					}
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}



}
