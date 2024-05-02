package com.entity.vo;

import com.entity.CaipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 菜品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-15
 */
@TableName("caipin")
public class CaipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
