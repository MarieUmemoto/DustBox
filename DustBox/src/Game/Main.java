package Game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		//フォワード
		String Level = request.getParameter("level");
		//ビーンズをインスタンス化
		Beans Beans = new Beans();
		//Levelを保存
		Beans.setLevel(Level);
        System.out.println(Beans.getLevel());
        request.setAttribute("level",Beans);

		//ゲーム画面へ
		RequestDispatcher D = request.getRequestDispatcher("DustBox.jsp");
		D.forward(request, response);

		//Gage.jsからAとBの値をとってビーンズに保存
		String A = request.getParameter("heightA");
		Beans.setA(A);
		String B = request.getParameter("powerB");
		Beans.setB(B);

		//Logicへ
		RequestDispatcher DisLogic = request.getRequestDispatcher("Logic.java");



		//Logic LG = new Logic();
		//LG.execute(LG.getA);




		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
