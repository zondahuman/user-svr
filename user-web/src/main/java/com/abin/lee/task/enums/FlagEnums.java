package com.abin.lee.task.enums;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.enums
 */
public enum FlagEnums {

    SUCCESS(1) {
        @Override
        public String toString() {
            return "执行成功";
        }
    },
    FAILURE(2) {
        @Override
        public String toString() {
            return "执行失败";
        }
    },
    EXCEPTION(3) {
        @Override
        public String toString() {
            return "执行异常";
        }
    },
    ;


    private final int reqType;//请求类型

    private FlagEnums(int reqType) {
        this.reqType = reqType;
    }

    public int getReqType() {
        return reqType;
    }

    @Override
    public abstract String toString();
}
