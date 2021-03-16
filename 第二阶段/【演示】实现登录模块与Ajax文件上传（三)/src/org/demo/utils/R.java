package org.demo.utils;

import java.io.Serializable;

/**
 *     异步返回 javabean  LayUI返回模板
 * @author 10947
 *
 */
public class R implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int total;
    private int status;
    private Object data;
    private String message="操作成功";

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * 返回成功状态
     * @param obj
     */
    public R returnSuccess(Object obj){
        this.status=Constants.ReturnResult.SUCCESS;
        this.data=obj;
        return this;
    }
    /**
     * 返回默认成功状态
     */
    public R returnSuccess(){
        this.status=Constants.ReturnResult.SUCCESS;
        return this;
    }
    /**
     * 返回失败状态
     * @param message
     */
    public R returnFail(String message){
        this.status=Constants.ReturnResult.FAIL;
        this.message=message;
        return this;
    }

    public R(String message, int status, Object data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public R(Object data) {
        this.status=Constants.ReturnResult.SUCCESS;
        this.data = data;
    }

    public R(){

    }

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
    
    
}
