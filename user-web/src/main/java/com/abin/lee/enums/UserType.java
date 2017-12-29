package com.abin.lee.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abin on 2017/12/29 16:26.
 * user-svr
 * com.abin.lee.enums
 */
public enum UserType {
    SYSTEM {
        public String toString() {
            return "系统用户";
        }
    },
    COMMON {
        public String toString() {
            return "普通用户";
        }
    },
    SPECIAL {
        public String toString() {
            return "特殊用户";
        }
    },
    TEST {
        public String toString() {
            return "测试用户";
        }
    };

    private UserType() {
    }

    public abstract String toString();

    public static List<String> getCommonUserType() {
        ArrayList list = new ArrayList();
        list.add(COMMON.name());
        list.add(SPECIAL.name());
        return list;
    }

    public static boolean isCommonUserType(UserType type) {
        return type == COMMON || type == SPECIAL;
    }
}