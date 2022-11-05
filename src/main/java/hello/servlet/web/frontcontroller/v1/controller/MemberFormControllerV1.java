package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        //i 컨트롤러 -> 뷰 이동시 사용
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        //i 다른 서블릿이나 JSP로 이동 기능, 서버 내부에서 다시 호출 발생
        dispatcher.forward(request, response);
    }
}
