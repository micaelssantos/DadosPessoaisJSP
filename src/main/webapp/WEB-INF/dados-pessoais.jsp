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
        <title> Micael Sousa Santos - Página Pessoal </title>
    </head>

    <body>
        <article>
            <h1>Micael de Sousa Santos</h1>
            <header>
                
                <div class="avatar">
                    <img src="img/micael.jpg" alt="Imagem Micael">
                </div>

                <div class="contato">
                    <p>(11)98234-3635</p>
                    <p><a href="mailto:micael.sousa.fenex@hotmail.com">micael.sousa.fenex@hotmail.com</a></p>
                    <p>Data Nascimento: 28/05/1997</p>
                    <p><a href="https://br.linkedin.com/">Linkedin</a></p>
                </div>
                
            </header>

            <section>
                <h2>Experiência Profissional</h2>
                <div>
                    <h3>Empresa: Aceex Processamento de Dados LTDA</h3>
                    <p>Cargo: Consultor B.I</p>
                    <p>A partir de: 2017</p>
                    <p>Descrição: </p>
                </div>
                <div>
                    <h3>Empresa: All Net Group</h3>
                    <p>Cargo: Analista de Suporte</p>
                    <p>A partir de: 2016</p>
                    <p>Descrição: </p>
                </div>
            </section>

            <section>
                <h2>Formação</h2>
                <div>
                    <h3>Centro Universitário Senac</h3>
                    <p>Tenólogo em Analise e Desenvolvimento de Sistemas</p>
                </div>
                <div>
                    <h3>Colégio São Sabas</h3>
                    <p>Ensino Médio Técnico em Informática</p>
                </div>
            </section>

            <section>
                <h2>Conhecimentos</h2>
                <ul>
                    <li>Java</li>
                    <li>Tecnologias Web (HTML, CSS, JavaScript)</li>
                    <li>SQL</li>
                    <li>PL/SQL</li>
                    <li>Power B.I</li>
                    <li>GoodData B.I</li>
                    <li>Scrum</li>
                    <li>ETL</li>
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
                            <th>Inglês</th>
                            <td>Bom <c:out value="${dad.getLeitura()}"/>        </td>
                            <td>Bom <c:out value="${dad.getEscrita()}"/>        </td>
                            <td>Bom <c:out value="${dad.getConversacao()}"/>    </td>
                        </tr>
                        <tr>
                            <th>Espanhol        </th>
                            <td>Bom  <c:out value="${dad.getLeitura()}"/>       </td>
                            <td>Ruim <c:out value="${dad.getEscrita()}"/>       </td>
                            <td>Ruim <c:out value="${dad.getConversacao()}"/>   </td>
                        </tr>
                    </tbody>
                </table>
            </section>

        </article>

    </body>

</html>