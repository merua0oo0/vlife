package cn.wwwlike.sys.api;

import cn.wwwlike.sys.entity.SysArea;
import cn.wwwlike.sys.entity.SysDept;
import cn.wwwlike.sys.req.SysAreaPageReq;
import cn.wwwlike.sys.service.SysAreaService;
import cn.wwwlike.vlife.bean.PageVo;
import cn.wwwlike.vlife.core.VLifeApi;
import cn.wwwlike.vlife.objship.read.GlobalData;
import cn.wwwlike.vlife.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 行政区划接口;
 */
@RestController
@RequestMapping("/sysArea")
public class SysAreaApi extends VLifeApi<SysArea, SysAreaService> {
  /**
   * 分页查询行政区划;
   * @param req 地区查询条件;
   * @return 行政区划;
   */
  @GetMapping("/page")
  public PageVo<SysArea> page(SysAreaPageReq req) {
    return service.findPage(req);
  }

  /**
   * 保存行政区划;
   * @param dto 行政区划;
   * @return 行政区划;
   */
  @PostMapping("/save")
  public SysArea save(@RequestBody SysArea dto) {
    return service.save(dto);
  }

  @GetMapping("/list/all")
  public List<SysArea> listAll(String entityName) {
    QueryWrapper<SysArea> wrapper = QueryWrapper.of(SysArea.class);
    if(entityName!=null&&!"sysArea".equals(entityName)){
      wrapper.filterRuleClz= GlobalData.entityDto(entityName).getClz();
    }
    return service.find(wrapper);
  }

  /**
   * 明细查询行政区划;
   * @param id 主键id;
   * @return 行政区划;
   */
  @GetMapping("/detail/{id}")
  public SysArea detail(@PathVariable String id) {
    return service.findOne(id);
  }

  /**
   * 有
   * @param id 主键id;
   * @return 已删除数量;
   */
  @DeleteMapping("/remove/{id}")
  public Long remove(@PathVariable String id) {
    return service.remove(id);
  }
}
