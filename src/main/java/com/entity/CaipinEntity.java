package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 菜品
 *
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("caipin")
public class CaipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipinEntity() {

	}

	public CaipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 菜品名称
     */
    @TableField(value = "caipin_name")

    private String caipinName;


    /**
     * 菜品类型
     */
    @TableField(value = "caipin_types")

    private Integer caipinTypes;


    /**
     * 菜品缩略图
     */
    @TableField(value = "caipin_photo")

    private String caipinPhoto;


    /**
     * 菜品单价
     */
    @TableField(value = "caipin_new_money")

    private Integer caipinNewMoney;


    /**
     * 菜品详情
     */
    @TableField(value = "caipin_content")

    private String caipinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：菜品名称
	 */
    public String getCaipinName() {
        return caipinName;
    }


    /**
	 * 获取：菜品名称
	 */

    public void setCaipinName(String caipinName) {
        this.caipinName = caipinName;
    }
    /**
	 * 设置：菜品类型
	 */
    public Integer getCaipinTypes() {
        return caipinTypes;
    }


    /**
	 * 获取：菜品类型
	 */

    public void setCaipinTypes(Integer caipinTypes) {
        this.caipinTypes = caipinTypes;
    }
    /**
	 * 设置：菜品缩略图
	 */
    public String getCaipinPhoto() {
        return caipinPhoto;
    }


    /**
	 * 获取：菜品缩略图
	 */

    public void setCaipinPhoto(String caipinPhoto) {
        this.caipinPhoto = caipinPhoto;
    }
    /**
	 * 设置：菜品单价
	 */
    public Integer getCaipinNewMoney() {
        return caipinNewMoney;
    }


    /**
	 * 获取：菜品单价
	 */

    public void setCaipinNewMoney(Integer caipinNewMoney) {
        this.caipinNewMoney = caipinNewMoney;
    }
    /**
	 * 设置：菜品详情
	 */
    public String getCaipinContent() {
        return caipinContent;
    }


    /**
	 * 获取：菜品详情
	 */

    public void setCaipinContent(String caipinContent) {
        this.caipinContent = caipinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caipin{" +
            "id=" + id +
            ", caipinName=" + caipinName +
            ", caipinTypes=" + caipinTypes +
            ", caipinPhoto=" + caipinPhoto +
            ", caipinNewMoney=" + caipinNewMoney +
            ", caipinContent=" + caipinContent +
            ", createTime=" + createTime +
        "}";
    }
}
