package org.lanqiao.project.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Condition {

    private Integer u_id;
    private String u_name;
    private String u_nickname;
    private Integer currentPage;
    private Integer pageSize;
    private String g_name;
    private Integer o_id;
    private Integer g_id;
    private String t_type;
    private String zhuangtai;
    private Integer id;
    private String jname;
}
