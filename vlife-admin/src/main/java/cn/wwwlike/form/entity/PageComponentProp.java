package cn.wwwlike.form.entity;

import cn.wwwlike.vlife.annotation.VField;
import cn.wwwlike.vlife.bean.DbEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 组件属性
 */
@Entity
@Data
@Table(name="page_component_prop")
public class PageComponentProp extends DbEntity {
    /***
     * 所属组件
     */
    public String pageComponentId;
    /**
     * 属性名称
     */
    public String propName;


    /**
     * 子属性名称
     */
    public String subName;

    /**
     * 数组排序号
     */
    public Integer listNo;
    /**
     * 属性值来源
     * 系统值/常量值/对象字段取值/接口取值
     */
    public String sourceType;
    /**
     * 属性值
     */
    public String propVal;

    /**
     * 接口取值到属性值的转换方法名称
     */
    public String apiMethod;

}
