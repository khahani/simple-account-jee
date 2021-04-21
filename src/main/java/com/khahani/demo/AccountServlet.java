package com.khahani.demo;

import com.khahani.demo.account.Record;
import com.khahani.demo.persist.RecordStorage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AccountServlet", value = "/account")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Record record = Record.getInstanceFactory(request.getParameter("status"));

        if (null != record) {
            record.setAmount(Integer.parseInt(request.getParameter("amount")));
            record.setDay(Integer.parseInt(request.getParameter("day")));
            record.setMonth(Integer.parseInt(request.getParameter("month")));
            record.setDescription(request.getParameter("description"));
        }

        RecordStorage rs = new RecordStorage();

        if (null != record)
            rs.add(record);

    }


}
