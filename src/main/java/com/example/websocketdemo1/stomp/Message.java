package com.example.websocketdemo1.stomp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linyun
 * @date 2018/9/13 下午5:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String to;
    private Long date;
    private String from;
    private String content;
}
