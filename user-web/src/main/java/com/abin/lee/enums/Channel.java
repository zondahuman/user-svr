package com.abin.lee.enums;

/**
 * Created by abin on 2017/12/29 16:26.
 * user-svr
 * com.abin.lee.enums
 */
public enum Channel {
    USER_RECOMMENDED {
        public String toString() {
            return "用户推荐";
        }

        public int getInviteCodeExpiredDays() {
            return 15;
        }
    },
    BD_IMPORT {
        public String toString() {
            return "BD导入";
        }

        public int getInviteCodeExpiredDays() {
            return 90;
        }
    },
    PERSONAL_REGISTER {
        public String toString() {
            return "用户个人注册";
        }

        public int getInviteCodeExpiredDays() {
            return 90;
        }
    },
    CHANNEL_REGISTER {
        public String toString() {
            return "渠道注册";
        }

        public int getInviteCodeExpiredDays() {
            return 90;
        }
    };

    private Channel() {
    }

    public abstract String toString();

    public abstract int getInviteCodeExpiredDays();

    public static boolean isToB(Channel channel) {
        return channel != PERSONAL_REGISTER;
    }
}
