package com.example.demotest.enu;

import com.example.demotest.enu.face.IEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum publish_status implements IEnum {
    /**
     * 是
     */
   T("1", "是"),
    /**
     * 否
     */
    F("2", "否");

    private String code;

    private String msg;


    public static String ofMsg(String code) {
        for (publish_status typeEnum : publish_status.values()) {
            if (typeEnum.code.equals(code)) {
                return typeEnum.getMsg();
            }
        }
        return null;
    }

    public static String ofMsg(Boolean code) {
        return Boolean.TRUE.equals(code) ? publish_status.F.getMsg() : publish_status.T.getMsg();
    }

}
