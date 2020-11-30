<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>register Products </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"  type="text/css">
    <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
            rel="stylesheet"
    />

</head>
    <body>
        <jsp:include page="../../head.jsp"></jsp:include>
        <!----------------------Account-page------------------->
        <div class="account-page">
            <div class="container">
                <div class="row">
                    <div class="col-2">
                        <img src="#" width = "100%">
                    </div>
                    <div class="col-2">
                        <div class="form-container">
                                <div class="form-btn">
                                    <span>registerProduct</span>
                                    <hr id = "Indicator">
                                </div>

                            <form action="registerProduct" method="post">
                                <div id="nomProduit">
                                    <label for="nomProduit">nom</label>
                                    <input type="text" name="nomProduit" value="${nomProduit}">

                                </div>

                                <div id="prixProduit">
                                    <label for="prixProduit">prix</label>
                                    <input type="text" name="prixProduit" value="${prixProduit}">
                                </div>

                                <div id="description">
                                    <label for="description">description</label>
                                    <input type="text" name="description" value="${description}">
                                </div>

                                <div id="couleur">
                                    <label for="couleur">couleur</label>
                                    <input type="text"  name="couleur" value="${couleur}">
                                </div>
                               <div id="taille">
                                   <label for="taille">taille</label>
                                   <input type="text"  name="taille" value="${taille}">
                               </div>

                                <div id="quantite">
                                    <label for="quantite">quantite</label>
                                    <input type="text"  name="quantite" value="${quantite}">
                                </div>

                                <div id="photos">
                                    <label for="photos">photos</label>
                                    <input type="text"  name="photos" value="${photos}">
                                </div>

                                <div id="idCategorie">
                                    <label for="idCategorie">idCategorie</label>
                                    <input type="text"  name="idCategorie" value="${idCategorie}">
                                </div>

                                <button type="submit" name="submit" class="btn">Register product</button>

                            </form>
                            <c:if test="${errors != null}">
                                Erreurs:
                                <ul>
                                    <c:forEach items="${errors}" var="error">
                                        <li>${error}</li>
                                    </c:forEach>
                                </ul>
                            </c:if>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <jsp:include page="../../foot.jsp"></jsp:include>
    </body>
</html>