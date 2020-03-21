package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginLogic")
public class LoginLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//フォワード先
		String forwardPath = null;

		//セッションスコープ登録ユーザーを保存
		HttpSession session = request.getSession();
		Login registerLogin = (Login) session.getAttribute("registerLogin");

		//サーブレットクラスの動作を決定する「action」の値をリクエストパラメータから取得
		String action = request.getParameter("action");

		if ("search".equals(action)) {
			if ("北村".equals(registerLogin.getName()) && "aaaa".equals(registerLogin.getPass())) {

				forwardPath = "/loginOk.jsp";
			} else {
				forwardPath = "/loginNg.jsp";
			}
		} else if (action.equals("form")) {
			forwardPath = "/loginForm.jsp";
		} else if (action.equals("out")) {
			forwardPath = "/logOut.jsp";
		} else if (action.equals("tweet")) {
			forwardPath = "/tweetBird.jsp";
		} else {
			forwardPath = "/logOut.jsp";
		}
		//設定されたフォワード先にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	/**
	 *
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String pass = request.getParameter("password");

		//登録するユーザーの情報を設定
		Login registerLogin = new Login(name, pass);

		//セッションスコープに登録ユーザーを保存
		HttpSession session = request.getSession();
		session.setAttribute("registerLogin", registerLogin);

		//フォワード 飛んでいく先だけ都度変える
		RequestDispatcher dispatcher = request.getRequestDispatcher("/loginComfirm.jsp");
		dispatcher.forward(request, response);
	}
}
