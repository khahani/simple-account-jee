package com.khahani.demo;

import com.khahani.demo.account.Record;

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

        Record record = null;
        int day = Integer.parseInt(request.getParameter("day"));
        int month = Integer.parseInt(request.getParameter("month"));
        String description = request.getParameter("description");
        int amount = Integer.parseInt(request.getParameter("amount"));
        try {
            record = (Record) Class.forName("com.khahani.demo.account." + request.getParameter("status"))
                    .newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        if (null != record) {
            record.setAmount(amount);
            record.setDay(day);
            record.setMonth(month);
            record.setDescription(description);
        }
    }
}
