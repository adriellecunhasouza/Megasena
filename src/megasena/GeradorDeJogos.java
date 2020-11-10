package megasena;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gerador-de-jogos")
public class GeradorDeJogos extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Random gerador = new Random();
		Integer quant = Integer.valueOf(req.getParameter("quant"));
		int vetor[] = new int[quant];
		out.print("<h1>GERADOR DE JOGOS DA MEGASENA</h1>");
			
		for (int i = 0; i < quant; i++) {
			out.print("<h2><b>Jogo Nº " + (i+1) + "</b>: <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			//out.print("<p>");
			for (int j = 0; j < 6; j++) {
				vetor[i] = gerador.nextInt(100);
				out.print(vetor[i]);
				out.print("&nbsp;&nbsp;&nbsp;");
				}
			out.print("</p>/h2>");
		}
			
	}
}
