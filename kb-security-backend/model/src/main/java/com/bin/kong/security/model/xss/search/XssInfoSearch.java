package com.bin.kong.security.model.xss.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XssInfoSearch {
    private String searchKey;
    private Integer user_id;
    private Integer status;
    @Builder.Default
    private Integer pageSize = 10;
    @Builder.Default
    private Integer pageNum = 1;
    private Integer startNum;
    @Builder.Default
    private Integer type=0;

    public Integer getStartNum() {
        if (pageNum > 0) {
            return pageSize * (pageNum - 1);
        } else {
            return 0;
        }
    }
}
