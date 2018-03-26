package controller;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;

import java.io.PrintWriter;

public class main extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		
		//escreve o texto
        out.println("<html>");
        out.println("<body>");
        out.println(usuario.getPessoa().getNome());
        out.println("</body>");
        out.println("</html>");

}
}