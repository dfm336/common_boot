//package com.dfm.boot.example.controllers.pojo;
//
//import com.alibaba.fastjson.JSONObject;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author hk
// * @date 2019/11/28 15:10
// */
//public class WebResult extends JSONObject {
//	private static final long serialVersionUID = 2658155239105891714L;
//	public static final String SUCCESS_KEY = "success";
//	public static final String REASON_CODE_KEY = "code";
//	public static final String REASON_DESC_KEY = "message";
//	public static final String DATA = "data";
//
//	public WebResult() {
//	}
//
//	public static WebResult getInstance(String desc, boolean success) {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", success);
//		jsonObj.put("message", desc);
//		return jsonObj;
//	}
//
//	public WebResult fillData(Object o) {
//		this.put("data", o);
//		return this;
//	}
//
//	public Object getData() {
//		return this.get("data");
//	}
//
//	public static WebResult getSuccessResult() {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", true);
//		jsonObj.put("code", ReasonCodeEnum.SUCCESS.getCode());
//		jsonObj.put("message", ReasonCodeEnum.SUCCESS.getDesc());
//		return jsonObj;
//	}
//
//	public static WebResult getFailureResult(ReasonCodeEnum reasonCodeEnum) {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", false);
//		jsonObj.put("code", reasonCodeEnum.getCode());
//		jsonObj.put("message", reasonCodeEnum.getDesc());
//		return jsonObj;
//	}
//
//	public static WebResult getFailureResult(ReasonCodeEnum reasonCodeEnum, String reasonDesc) {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", false);
//		jsonObj.put("code", reasonCodeEnum.getCode());
//		jsonObj.put("message", reasonDesc);
//		return jsonObj;
//	}
//
//	public static WebResult getFailureResult(String reasonCode, String reasonDesc) {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", false);
//		jsonObj.put("code", reasonCode);
//		jsonObj.put("message", reasonDesc);
//		return jsonObj;
//	}
//
//	public static WebResult paramWrong(String reasonDesc) {
//		WebResult jsonObj = new WebResult();
//		jsonObj.put("success", false);
//		jsonObj.put("code", ReasonCodeEnum.FAIL.getCode());
//		jsonObj.put("message", reasonDesc);
//		return jsonObj;
//	}
//
//	public boolean isSuccess() {
//		Object o = this.get("success");
//		return null != o && o instanceof Boolean ? (Boolean) o : false;
//	}
//
//	public String getReasonDesc() {
//		return (String) this.get("message");
//	}
//
//	public String getReasonCode() {
//		return (String) this.get("code");
//	}
//
//	public static <T> WebResult successPage(T t, int total, int currentPage, int pageSize) {
//		WebResult result = getSuccessResult();
//		Map<String, Object> data = new HashMap<>(4);
//		data.put("total", total);
//		data.put("list", t);
//		data.put("current", currentPage);
//		data.put("pageSize", pageSize);
//		result.fillData(data);
//
//		return result;
//	}
//
//	/**
//	 * 返回单值对象
//	 *
//	 * @param t 要返回的业务数据
//	 */
//	public static <T> WebResult successData(T t) {
//		WebResult webResponse = getSuccessResult();
//		webResponse.fillData(t);
//		return webResponse;
//	}
//}
