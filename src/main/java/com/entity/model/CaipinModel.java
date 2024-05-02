package com.entity.model;

import com.entity.CaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 菜品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class CaipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 菜品名称
     */
    private String caipinName;


    /**
     * 菜品类型
     */
    private Integer caipinTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：菜品名称
	 */
    public String getCaipinName() {
        return caipinName;
    }


    /**
	 * 设置：菜品名称
	 */
    public void setCaipinName(String caipinName) {
        this.caipinName = caipinName;
    }
    /**
	 * 获取：菜品类型
	 */
    public Integer getCaipinTypes() {
        return caipinTypes;
    }


    /**
	 * 设置：菜品类型
	 */
    public void setCaipinTypes(Integer caipinTypes) {
        this.caipinTypes = caipinTypes;
    }
    /**
	 * 获取：菜品缩略图
	 */
    public String getCaipinPhoto() {
        return caipinPhoto;
    }


    /**
	 * 设置：菜品缩略图
	 */
    public void setCaipinPhoto(String caipinPhoto) {
        this.caipinPhoto = caipinPhoto;
    }
    /**
	 * 获取：菜品单价
	 */
    public Integer getCaipinNewMoney() {
        return caipinNewMoney;
    }


    /**
	 * 设置：菜品单价
	 */
    public void setCaipinNewMoney(Integer caipinNewMoney) {
        this.caipinNewMoney = caipinNewMoney;
    }
    /**
	 * 获取：菜品详情
	 */
    public String getCaipinContent() {
        return caipinContent;
    }


    /**
	 * 设置：菜品详情
	 */
    public void setCaipinContent(String caipinContent) {
        this.caipinContent = caipinContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
