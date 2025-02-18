/*
 *  vlife http://github.com/wwwlike/vlife
 *
 *  Copyright (C)  2018-2022 vlife
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package cn.wwwlike.auth.dto;

import cn.wwwlike.auth.entity.SysGroup;
import cn.wwwlike.vlife.annotation.VField;
import cn.wwwlike.vlife.base.SaveBean;
import lombok.Data;

import java.util.List;

/**
 * 角色组dto
 * , VoBean<SysGroup>
 */
@Data
public class GroupDto implements SaveBean<SysGroup>{
    /**
     * 角色组id
     */
    public String id;
    /**
     * 组名称
     */
    public String name;
    /**
     * 组描述
     */
    public String remark;
    /**
     * 角色集合
     */
    @VField(pathName = "sysRoleGroup_sysRoleId")//多对多保存 应该保存对象
    public List<String> sysRoleId;

//    public Integer scope;

    /**
     * 数据维度
     * 过滤模型_维度 sysUser_1->据用户表过滤，本级
     */
    public String filterType;


}
