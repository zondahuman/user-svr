package com.abin.lee.task.service.vo.response;

import com.abin.lee.task.enums.FlagEnums;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by abin on 2017/12/29 2017/12/29.
 * user-svr
 * com.abin.lee.task.service.vo.response
 */
@Setter
@Getter
public class ExternalResponse {

    private String status;
    private String message;
    private String data;

    public ExternalResponse() {
    }


    public static ExternalResponse success(){
        ExternalResponse externalResponse = new ExternalResponse();
        externalResponse.setStatus(FlagEnums.SUCCESS.name());
        return externalResponse;
    }
    public static ExternalResponse failure(){
        ExternalResponse externalResponse = new ExternalResponse();
        externalResponse.setStatus(FlagEnums.FAILURE.name());
        return externalResponse;
    }
}
