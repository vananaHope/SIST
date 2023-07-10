package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import backendWeb.z01_vo.Product;

/**
 * Servlet implementation class A09_AjaxController02
 */
@WebServlet(name = "buyProduct.do", urlPatterns = { "/buyProduct.do" })
public class A09_AjaxController02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A09_AjaxController02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String pname = request.getParameter("pname");
		String priceS = request.getParameter("price");
		String cntS = request.getParameter("cnt");
		if(pname==null || pname.equals("")) pname="구매한 물건이 없습니다.";
		int price = 0;
		if(priceS!=null && !priceS.equals("")) price=Integer.parseInt(priceS);
		int cnt = 0;
		if(cntS!=null && !cntS.equals("")) cnt=Integer.parseInt(cntS);
		
		/*요청값을 객체로 만들어서 전송*/
		Product p = new Product(pname,price,cnt);
		Gson g = new Gson();
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		response.getWriter().print(g.toJson(p));
		
		//A10_AjaxController.java
		//  mname=sunflower&singer=post malon
		//	&pubyear=2000
		// Music에 넘겨서 Json데이터로 위 내용을 json 객체로 출력 처리
	}

}
