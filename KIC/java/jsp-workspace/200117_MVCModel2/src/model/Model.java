package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface Model
{
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
