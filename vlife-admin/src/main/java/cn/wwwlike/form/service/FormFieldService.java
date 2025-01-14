package cn.wwwlike.form.service;

import cn.wwwlike.form.dao.FormFieldDao;
import cn.wwwlike.form.entity.FormField;
import cn.wwwlike.vlife.core.VLifeService;
import cn.wwwlike.vlife.objship.dto.FieldDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FormFieldService extends VLifeService<FormField, FormFieldDao> {

    /**
     * 将模型字段信息转成数据表的字段信息集合
     * @param dtos
     * @return
     */
    public List<FormField> getFieldList(List<FieldDto> dtos){
        List<FormField> fields=new ArrayList<>();
        int i=0;
        for(FieldDto dto:dtos){
            FormField formField=new FormField();
            BeanUtils.copyProperties(dto,formField);//dto->entityItem
            i++;
            formField.setSort(i);
//            //组件初始化
//            if(formField.getType().equals("string")){
//                formField.setX_component("Input");
//            }
//            if(formField.getType().equals("integer")){
//                formField.setX_component("Input");
//            }
            fields.add(formField);


        }
        return fields;
    }

}
