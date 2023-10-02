/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.servlet_filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ginoya
 */

public class servletFilter1 implements Filter
{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest)request;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(req.getParameter("ID"));

        if(id>0)
        {
            chain.doFilter(request,response);
        }
        else
        {
            if(id==0)
            {
                chain.doFilter(request,response);
            }
            else
            {
                chain.doFilter(request,response);
            }
        }
    }
}
