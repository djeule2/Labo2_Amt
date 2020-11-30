
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>All Products </title>
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
                        <span>register</span>
                        <hr id = "Indicator">
                    </div>

                    <form action="register" method="post" >
                        <div id="nom">
                            <label for="nom">nom</label>
                            <input type="text" name="nomClient" value="${nomClient}">
                        </div>

                        <div id="emmail">
                            <label for="emmail">email</label>
                            <input type="text" name="email" value="${email}">
                        </div>

                        <div id="tel">
                            <label for="tel">tel</label>
                            <input type="text" name="tel" value="${tel}">
                        </div>

                        <div id="userName">
                            <label for="userName">User Name</label>
                            <input type="text"  name="userName" value="${useName}">
                        </div>
                        <div id="passwrd">
                            <label for="passwrd">password</label>
                            <input type="password" name="passwrd" value="${passwrd}">
                        </div>


                        <button type="submit" name="submit" class="btn">Register</button>
                        <br>
                        <a href="checkout">or Signe In</a>

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