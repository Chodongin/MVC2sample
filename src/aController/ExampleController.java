package aController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dModel.ExampleDto;
import bService.ExampleService;
import bService.ExampleServiceImpl;

public class ExampleController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ExampleService service = ExampleServiceImpl.getInstace();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("html/text; charset=utf-8");

		
		String cmd = req.getParameter("cmd");
		String pageName="";
		
		switch (cmd) {
			case "login":
				pageName = "example/Example";
				break;
			case "loginAction":
				pageName = "anything/Anything";				
				ExampleDto dto = service.loginAction(new ExampleDto(req.getParameter("id"), req.getParameter("password"), null));
				
				System.err.println(dto.toString());
				
				break;
		}
		
		dispatch(pageName,req,resp);
	}
	
	public void dispatch(String urls, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dsp = req.getRequestDispatcher(urls+".jsp");
		dsp.forward(req, resp);
	}
}
