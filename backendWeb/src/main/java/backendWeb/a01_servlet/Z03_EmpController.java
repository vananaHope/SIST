package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

/**
 * Servlet implementation class Z03_EmpController
 */
@WebServlet(name = "emp.do", urlPatterns = { "/emp.do" })
public class Z03_EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Z03_EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empnoS = request.getParameter("empno");
		int empno = 0;
		if(empnoS!=null) empno = Integer.parseInt(empnoS);
		
		
		A04_PreparedDao dao = new A04_PreparedDao();
		Emp e = dao.getEmp(empno);
		
		response.setContentType("text/plain;utf-8");
		response.setCharacterEncoding("utf-8");
		
		Gson g = new Gson();
		
		response.getWriter().print(g.toJson(e));
		if(empnoS == null || empnoS.equals("")) {
			response.getWriter().print("");
		}

		
 	}

}
