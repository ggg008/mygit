﻿<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>

<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%

	JSONObject result = new JSONObject(), obj = new JSONObject();
	result.put("flag", "0");
	
	obj.put("seq", (String)request.getAttribute("seq"));
	obj.put("subject", (String)request.getAttribute("subject"));
	obj.put("writer", (String)request.getAttribute("writer"));
	obj.put("mail", (String)request.getAttribute("mail"));
	obj.put("wip", (String)request.getAttribute("wip"));
	obj.put("wdate", (String)request.getAttribute("wdate"));
	obj.put("hit", (String)request.getAttribute("hit"));
	obj.put("content", (String)request.getAttribute("content"));
	result.put("data", obj);
	
	out.println(result);
	
%>