package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/ServletLoginServlet")
public class DokotubuServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

		//フォワード先
		String forwardPath = null;

		//サーブレットクラスの動作を決定する「action」の値をリクエストパラメータから取得
		String action = request.getParameter("action");

		//Top画面をリクエストされたときの処理
		if(action == null) {
			//フォワード先を設定
			forwardPath = "/dokotubuTop.jsp";

			//不要となったセッションスコープ内のインスタンスを削除
			HttpSession session = request.getSession();
			session.removeAttribute("DokotubuUser");
		}

		//ログイン成功画面からメイン画面をリクエストされたときの処理
		else if(action.equals("main")) {
			//ログイン成功後のフォワード先を設定
			forwardPath = "/dokotubuMain.jsp";
		}

		//設定されたフォワード先にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");

		//フォワード先
		String forwardPath = null;

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		//登録するユーザーの情報を設定
		DokotubuUser dUser = new DokotubuUser(name, pass);

		//セッションスコープ登録ユーザーを保存
		HttpSession session = request.getSession();
		session.setAttribute("DokotubuUser", dUser);

		//登録後のフォワード先を設定
		DokotubuUserLoginLogic logic = new DokotubuUserLoginLogic();
		if(logic.execute(dUser)) {
			forwardPath = "/dokotubuDone.jsp";
		}else {
			forwardPath = "/dokotubuNotDone.jsp";
		}

		//設定されたフォワード先にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);

	}
}
