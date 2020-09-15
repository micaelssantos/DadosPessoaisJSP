<%-- 
    Document   : dados-pessoais
    Created on : 13/09/2020, 12:41:25
    Author     : Micael Santos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
        <link rel="stylesheet" href="css/estilo.css"> 
        <title> <c:out value="${pessoa.getNome()}"/> - Página Pessoal </title>
    </head>

    <body>
        <article>
            <h1><c:out value="${pessoa.getNome()}"/></h1>
            <header>
                <div class="avatar">
                    <img src="${pessoa.getImagemPerfil()}" alt="Imagem Micael">
                </div>

                <div class="contato">
                    <p><c:out value="${pessoa.getTelefone()}"/></p>
                    <p><a href="mailto:${pessoa.getEmail()}"><c:out value="${pessoa.getEmail()}"/></a></p>
                    <p>Data Nascimento: <c:out value="${pessoa.getDataNascimento()}"/></p>
                    <p><c:out value="${pessoa.getEstado()}"/></p>
                    <p><a href="https://br.linkedin.com/">Linkedin</a></p>
                </div>
            </header>

            <section>
                <h2>Experiência Profissional</h2>
                <div>
                    <h3><span>Empresa: </span> <c:out value="${pessoa.getNomeEmpresa()}"/></h3>
                    <p><span>Cargo: </span> <c:out value="${pessoa.getCargo()}"/></p>
                    <p><span>A partir de:</span> <c:out value="${pessoa.getDataInicioEmpresa()}"/></p>
                    <p><span>Descrição:</span> <c:out value="${pessoa.getDetalhe()}"/></p>
                </div>
            </section>

            <section>
                <h2>Formação</h2>
                <div>
                    <h3><span>Instituição:</span> <c:out value="${pessoa.getNomeInstituicao()}"/></h3>
                    <p><span>Curso:</span> <c:out value="${pessoa.getGraduacao()}"/></p>
                </div>
            </section>

            <section>
                <h2>Conhecimentos</h2>
                <ul>
                    <li><c:out value="${pessoa.getConhecimentos()}"/></li>
                </ul>
            </section>

            <section>
                <h2>Idioma</h2>
                <table>
                    <thead>
                        <tr>
                            <th>&nbsp;</th>
                            <th>Leitura</th>
                            <th>Escrita</th>
                            <th>Conversação</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th><c:out value="${pessoa.getIdioma()}"/></th>
                            <td><c:out value="${pessoa.getLeitura()}"/>        </td>
                            <td><c:out value="${pessoa.getEscrita()}"/>        </td>
                            <td><c:out value="${pessoa.getConversacao()}"/>    </td>
                        </tr>
                    </tbody>
                </table>
            </section>

        </article>

    </body>

</html>