package com.jacobz.nxauto.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.util.StringUtils;

/**
 * @author imJacobz
 */
@Data
@Accessors(chain = true)
public class ResponseData<T> {
    private String code;
    private String message;
    private T data;
    private long timestamp;


    public ResponseData() {
        this.timestamp = System.currentTimeMillis();
    }


    /**
     * success response data
     * @param data the entity/model data to be returned to the frontend
     * @return ResponseData
     */
    public static <T> ResponseData<T> success(T data) {
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setCode(ReturnCode.SUCCESS.getCode());
        responseData.setMessage(ReturnCode.SUCCESS.getMessage());
        responseData.setData(data);
        return responseData;
    }

    /**
     * service downgraded response data
     * @param data the downgraded data to be returned to the frontend
     * @return ResponseData
     */
    public static <T> ResponseData<T> downgraded(T data) {
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setCode(ReturnCode.SERVICE_DOWNGRADED.getCode());
        responseData.setMessage(ReturnCode.SERVICE_DOWNGRADED.getMessage());
        responseData.setData(data);
        return responseData;
    }

    /**
     * failure response data with customize message
     * @param returnCode the return code of response data
     * @param message the response message, if not present, the default message will be displayed
     * @return ResponseData
     */
    public static <T> ResponseData<T> fail(ReturnCode returnCode, String message) {
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setCode(returnCode.getCode());
        responseData.setMessage(StringUtils.hasText(message) ? message : returnCode.getMessage());
        return responseData;
    }

    /**
     * failure response data with default error message
     * @param returnCode the return code of response data
     * @return ResponseData
     */
    public static <T> ResponseData<T> fail(ReturnCode returnCode) {
        return fail(returnCode, null);
    }
}
