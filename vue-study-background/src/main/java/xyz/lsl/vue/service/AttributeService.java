package xyz.lsl.vue.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;
import xyz.lsl.vue.entity.Attribute;

/**
 * <p>
 * 属性表 服务类
 * </p>
 *
 * @author YIQU
 * @since 2022-03-28 21:54:01
 */
@Transactional
public interface AttributeService extends IService<Attribute> {

}
