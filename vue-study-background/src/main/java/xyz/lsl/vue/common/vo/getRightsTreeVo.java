package xyz.lsl.vue.common.vo;

import lombok.Data;

import java.util.List;


@Data
public class getRightsTreeVo {

    private Integer id;
    private String authName;
    private String paths;
    private List<permission> children;//二级权限

    @Data
    public static class permission {
        private Integer id;
        private String authName;
        private String paths;
        private List<children> children;//三级权限

        @Data
        public static class children {
            private Integer id;
            private String authName;
            private String paths;
        }
    }
}
