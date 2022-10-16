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

package cn.wwwlike.auth.entity;


import cn.wwwlike.vlife.annotation.VField;
import cn.wwwlike.vlife.bean.DbEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 权限资源
 */
@Data
@Entity
@Table(name = "sys_reources")
public class SysResources  extends DbEntity {
    /**
     * 资源名称
     */
    public String name;
    /**
     * 资源类型
     */
    @VField(dictCode = "SYSRESOURCES_TYPE")
    public String type;
    /**
     * 接口地址
     */
    public String url;
    /**
     * 资源编码
     */
    public String resourcesCode;
    /**
     * 图标
     */
    public String icon;
    /**
     * 归属角色
     */
    public String sysRoleId;
    /**
     * 依赖资源
     */
    public String resourcesPcode;
    /**
     * 归属菜单
     */
    public String menuCode;

}
