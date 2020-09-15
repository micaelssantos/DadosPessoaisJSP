package br.sp.senac.tads.dsw.servlets;

import br.sp.senac.tads.dsw.model.Pessoa;
import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Micael Santos
 */
@WebServlet(name = "PessoaServlet", urlPatterns = {"/pessoaservlet"})
public class PessoaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Micael de Sousa Santos");
        pessoa.setImagemPerfil("img/micael.jpg");
        pessoa.setTelefone("(11)98234-3635");
        pessoa.setDataNascimento(LocalDate.of(1997, 05, 28));
        pessoa.setEmail("micael.sousa.fenex@gmail.com");
        pessoa.setEstado("São Paulo, SP");
        pessoa.setNomeEmpresa("Aceex Processamento de Dados LTDA");
        pessoa.setCargo("Consultor B.I");
        pessoa.setDataInicioEmpresa(LocalDate.of(2017, 10, 16));
        pessoa.setDetalhe("Desenvolver visões analíticas às áreas de negócios através do processo de ETL com utilização das plataformas Power B.I e GoodData");
        pessoa.setNomeInstituicao("Centro Universitário Senac");
        pessoa.setGraduacao("Tenólogo em Analise e Desenvolvimento de Sistemas");
        pessoa.setConhecimentos("Java | Tecnologias Web (HTML, CSS, JavaScript) | SQL | PL/SQL | Power B.I | GoodData B.I | Scrum | ETL");
        pessoa.setIdioma("Inglês");
        pessoa.setLeitura("Bom");
        pessoa.setEscrita("Bom");
        pessoa.setConversacao("Bom");

        request.setAttribute("pessoa", pessoa);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/dados-pessoais.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
