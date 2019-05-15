package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class _01Servlet
 */
@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int iVal = 10;
		long lVal = 10;
		float fVal = 3.24f;
		boolean bVal= true;
		Object obj = null;
		

		
		
		request.setAttribute("iVal", iVal);
		request.setAttribute("lVal", lVal);
		request.setAttribute("fVal", fVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("obj", obj);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("iVal",iVal);
		map.put("lVal",lVal);
		map.put("bVal",bVal);
		map.put("fVal",fVal);
		request.setAttribute("map", map);
		// el scope test
		UserVo vo = new UserVo();
		vo.setNo(10);
		vo.setName("둘리");
		
		//request scope
		request.setAttribute("vo", vo);
		
		// session scope
		UserVo vo2 = new UserVo();
		vo2.setNo(20);
		vo2.setName("메이콜");
		HttpSession session = request.getSession(true);
		session.setAttribute("vo", vo2);
		
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public class UserVo{
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		int no;
		String name;
	}
}
