package com.hxh.blog.util;

/*
 * 接口统一返回格式
 * */

public class ResponseWrapper {

    /*是否成功*/
    private boolean success;
    /*返回码*/
    private String code;
    /*返回信息*/
    private String msg;
    /*返回数据*/
    private Object data;

    /**
     * 自定义返回结果
     * 建议使用统一的返回结果，特殊情况可以使用此方法
     *
     * @param success
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static ResponseWrapper markCustom(boolean success, String code, String msg, Object data) {
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setSuccess(success);
        responseWrapper.setCode(code);
        responseWrapper.setMsg(msg);
        responseWrapper.setData(data);
        return responseWrapper;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
