package com.ekwoo.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/requestInfo")
public class RequestInfoController {
	Logger logger = LoggerFactory.getLogger(RequestInfoController.class);
	
	@RequestMapping(value="useragent", method = RequestMethod.GET)
	public String printUserAgent(HttpServletRequest request) {
		if(logger.isDebugEnabled()) {
			logger.debug("useragent : {}", request.getHeader("User-Agent"));
		}
		return "requestInfo/useragent";
	}
}
