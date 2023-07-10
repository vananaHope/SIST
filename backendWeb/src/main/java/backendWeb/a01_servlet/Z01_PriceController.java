package backendWeb.a01_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Z01_PriceController
 */
@WebServlet(name = "price.do", urlPatterns = { "/price.do" })
public class Z01_PriceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Z01_PriceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String priceS = request.getParameter("price");
		int price = 0;
		if(priceS!=null && !priceS.equals("")) price = Integer.parseInt(priceS);
		
		String saleRateS = request.getParameter("saleRate");
		Double saleRate = 0.0;
		if(saleRateS!=null) saleRate = Double.parseDouble(saleRateS)/100.0;
		
		int finalP = price - (int)(price*saleRate);
		
		response.setContentType("text/plain;utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.getWriter().print(finalP);
		
	}

}
