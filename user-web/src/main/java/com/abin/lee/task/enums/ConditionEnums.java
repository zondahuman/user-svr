package com.abin.lee.task.enums;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.enums
 */
public enum ConditionEnums {

    OPERATOR(1) {
        @Override
        public String toString() {
            return "运营商";
        }
    },
    BLACK(2) {
        @Override
        public String toString() {
            return "黑名单";
        }
    },;


    private final int reqType;//请求类型

    private ConditionEnums(int reqType) {
        this.reqType = reqType;
    }

    public int getReqType() {
        return reqType;
    }

    @Override
    public abstract String toString();
}
