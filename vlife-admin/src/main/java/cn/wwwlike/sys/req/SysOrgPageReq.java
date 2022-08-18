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

package cn.wwwlike.sys.req;

import cn.wwwlike.sys.entity.SysOrg;
import cn.wwwlike.vlife.annotation.VField;
import cn.wwwlike.vlife.dict.Opt;
import cn.wwwlike.vlife.query.req.PageQuery;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 机构查询条件
 */
@Data
public class SysOrgPageReq extends PageQuery<SysOrg> {
    /**
     * 地区
     */
    public String sysAreaId;
    public List<Date> enableDate;
    @VField(opt = Opt.like,orReqFields = {"code"})
    public String name;
    public String type;
}