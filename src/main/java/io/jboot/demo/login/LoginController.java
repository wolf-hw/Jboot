package io.jboot.demo.login;

import com.jfinal.core.paragetter.Para;

import io.jboot.demo.RestResult;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController extends JbootController {
	public void loginText2(@Para("username")String username, @Para("password")String password) {
		RestResult<?> restResult;
		System.out.println(username + "---" + password);
		if("123456".equals(password) && "admin".equals(username)) {
			restResult = RestResult.buildSuccess();
		} else {
			restResult = RestResult.buildError("帐号或密码不正确");
		}
		renderJson(restResult);
	}
	
	public void loginText1() {
		RestResult<?> restResult;
		String username = getPara("username");
		String password = getPara("password");
		System.out.println(username + "---" + password);
		if("123456".equals(password) && "admin".equals(username)) {
			restResult = RestResult.buildSuccess();
		} else {
			restResult = RestResult.buildError("帐号或密码不正确");
		}
		renderJson(restResult);
	}
}
