package cn.wwwlike.auth.entity;

import cn.wwwlike.vlife.annotation.VClazz;
import cn.wwwlike.vlife.base.ITree;
import cn.wwwlike.vlife.bean.DbEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 菜单
 */
@Data
@Entity
@Table(name = "sys_menu")
@VClazz(orders = "sort_asc")
public class SysMenu extends DbEntity implements ITree {
    /**
     * 应用
     */
    public boolean app;
    /**
     * 菜单名称
     */
    public String name;
    /**
     * 编码
     */
    public String code;
    /**
     * 上级菜单编码
     */
    public String pcode;
    /**
     * 路由地址
     * 叶子菜单必须有url
     */
    public String url;

    /**
     * 占位符地址
     * url里的*号替换地址
     */
    public String placeholderUrl;

    /**
     * 排序号
     */
    public Integer sort;

    /**
     * 图标
     */
    public String icon;

    /**
     * 实体模型
     * 可快速将相关接口与其关联
     */
    public String entityType;

    /**
     * 实体名前缀
     *  app应用true时，关联本应用的实体表，不用下级的entityType查找了，多个实体名之间用逗号分隔
     */
    public String entityPrefix;
}
