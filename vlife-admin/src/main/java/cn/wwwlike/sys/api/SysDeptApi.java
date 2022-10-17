package cn.wwwlike.sys.api;

import cn.wwwlike.sys.entity.SysArea;
import cn.wwwlike.sys.entity.SysDept;
import cn.wwwlike.sys.entity.SysOrg;
import cn.wwwlike.sys.req.SysDeptPageReq;
import cn.wwwlike.sys.service.SysDeptService;
import cn.wwwlike.vlife.bean.PageVo;
import cn.wwwlike.vlife.core.VLifeApi;
import cn.wwwlike.vlife.objship.read.GlobalData;
import cn.wwwlike.vlife.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * null接口;
 */
@RestController
@RequestMapping("/sysDept")
public class SysDeptApi extends VLifeApi<SysDept, SysDeptService> {
  /**
   * 分页查询null;
   * @param req 部门查询条件;
   * @return null;
   */
  @GetMapping("/page")
  public PageVo<SysDept> page(SysDeptPageReq req) {
    return service.findPage(req);
  }

  /**
   * 保存null;
   * @param dto null;
   * @return null;
   */
  @PostMapping("/save")
  public SysDept save(@RequestBody SysDept dto) {
    return service.save(dto);
  }


  @GetMapping("/list/all")
  public List<SysDept> listAll(String entityName) {
    QueryWrapper<SysDept> wrapper = QueryWrapper.of(SysDept.class);
    if(!entityName.equals("sysDept")){
      wrapper.filterRuleClz= GlobalData.entityDto(entityName).getClz();
    }
    return service.find(wrapper);

  }


  /**
   * 明细查询null;
   * @param id 主键id;
   * @return null;
   */
  @GetMapping("/detail/{id}")
  public SysDept detail(@PathVariable String id) {
    return service.findOne(id);
  }

  /**
   * 逻辑删除;
   * @param id 主键id;
   * @return 已删除数量;
   */
  @DeleteMapping("/remove/{id}")
  public Long remove(@PathVariable String id) {
    return service.remove(id);
  }
}