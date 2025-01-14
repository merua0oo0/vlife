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

package cn.wwwlike.vlife.base;

import cn.wwwlike.base.model.IdBean;

/**
 * 树型关系实体
 * 实现该接口，保存时能自动对code进行计算生成
 * 规范：
 * 下级code以上级开头，以下划线分隔如：
 * 42->42_01->42_01_06
 */
public interface ITree extends IdBean {
  public String getName();
  public void setName(String name);
  public String getCode();
  public String getPcode();
  public void setCode(String code);
  public void setPcode(String pcode);
}
