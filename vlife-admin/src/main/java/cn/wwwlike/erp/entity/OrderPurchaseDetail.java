package cn.wwwlike.erp.entity;

import cn.wwwlike.vlife.annotation.VClazz;
import cn.wwwlike.vlife.annotation.VField;
import cn.wwwlike.vlife.bean.DbEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 采购明细
 */
@Data
@Entity
@Table(name = "erp_order_purchase_detail")
@VClazz(module = "erp")
public class OrderPurchaseDetail extends DbEntity {
    /**
     * 采购产品
     */
    public String productId;
    /**
     * 采购单
     */
    public String orderPurchaseId;

    /**
     * 采购数量
     */
    public Integer total;

    /**
     * 采购单价
     */
    public Double price;

}
