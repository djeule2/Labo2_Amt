
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/normalize.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"  type="text/css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
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
                            <span>Login</span>
                            <hr id = "Indicator">
                        </div>

                        <form id="LoginForm" action="checkout" method="post">

                            <div id="userName">
                                <label for="userName">nom</label>
                                 <input type="text" name="userName" value="${userName}">
                            </div>

                            <div id="passwrd">
                                <label for="passwrd">passwrd</label>
                                <input type="password" name="passwrd" value="${passwrd}">
                            </div>

                            <br> <br>
                            <button id="bSignIn" type="submit" class="btn">Login</button>
                            <a href="#">Forgot password</a>
                            <br>
                            <a href="register">or Signe Up</a>

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