package cn.cabbsir.curd.bean;

import java.util.HashMap;
import java.util.Map;

public class Massage {
	private int code;
	private String message;
	private Map<String,Object> extend = new HashMap<String, Object>();

	public static Massage success(){
		Massage result = new Massage();
		result.setCode(100);
		result.setMessage("成功处理");
		return result;
	}
	public static Massage fail(){
		Massage result = new Massage();
		result.setCode(200);
		result.setMessage("处理失败");
		return result;
	}
	//链式操作
	public Massage add(String key,Object value){
		this.getExtend().put(key,value);
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
}
