package cn.yangself.servlet;

import cn.yangself.domain.User;
import cn.yangself.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();//创建业务类实例
        User user = userService.find();//接收业务类处理后的数据
        req.setAttribute("user",user);//将接收到的数据存到request域中

        req.getRequestDispatcher("/result.jsp").forward(req,resp);//跳转到result页面显示结果
    }
}
