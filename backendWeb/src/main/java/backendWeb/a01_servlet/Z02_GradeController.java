package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Salgrade;

/**
 * Servlet implementation class Z02_GradeController
 */
@WebServlet(name = "grade.do", urlPatterns = { "/grade.do" })
public class Z02_GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Z02_GradeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String gradeS = request.getParameter("grade");
		int grade = 0;
		if(gradeS!=null) grade = Integer.parseInt(gradeS);
		
		A04_PreparedDao dao = new A04_PreparedDao();
		Salgrade sa = dao.getSal(grade);
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		
		Gson g = new Gson();
		response.getWriter().print(g.toJson(sa));
		
	}

}
