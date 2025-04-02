package org.sortic.sorticproject.Service;

import org.sortic.sorticproject.Entity.Element;
import org.sortic.sorticproject.Mapper.ElementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ElementService {

    @Autowired
    private ElementMapper elementMapper;

    // 상품 추가
    public void addElement(Element element) {
        elementMapper.insertElement(element);
    }

    // 상품 조회
    public Element getElementById(int elements_name_id) {
        return elementMapper.getElementById(elements_name_id);
    }

    // 카테고리별 상품 목록 조회
    public List<Element> getElementsByCategoryId(int category_id) {
        return elementMapper.getElementsByCategoryId(category_id);
    }

    // 상품 수정
    public void updateElement(int elements_name_id, String elements_name ) {
        elementMapper.updateElement(elements_name_id, elements_name);
    }

    // 상품 삭제
    public void deleteElement(int elements_name_id) {
        elementMapper.deleteElement(elements_name_id);
    }
}
