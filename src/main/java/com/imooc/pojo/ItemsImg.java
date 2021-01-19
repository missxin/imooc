package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "items_img")
public class ItemsImg {
    @Id
    private Integer id;

    /**
     * 商品外键id
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 顺序
     */
    private String sort;

    /**
     * 是否主图
     */
    @Column(name = "is_main")
    private String isMain;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品外键id
     *
     * @return item_id - 商品外键id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键id
     *
     * @param itemId 商品外键id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 获取是否主图
     *
     * @return is_main - 是否主图
     */
    public String getIsMain() {
        return isMain;
    }

    /**
     * 设置是否主图
     *
     * @param isMain 是否主图
     */
    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}