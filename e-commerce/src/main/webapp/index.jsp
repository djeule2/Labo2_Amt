<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset = "UTF-8">
        <meta name = "viewport" content="width=device-width, initial-scale=1.0">
        <title>DjeulezeckStore | Ecommerce Website Design</title>
        <link rel="stylesheet"  href="css/normalize.css" />
        <link rel="stylesheet"  type="text/css"  href="${pageContext.request.contextPath}/css/style.css" />

        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
                rel="stylesheet"/>
    </head>

    <body>
        <jsp:include page="head.jsp"></jsp:include>
        <div class="row">
            <div class="col-2">
                <h1> best site of shop</h1>
                <p> success isn't always about greatness. It's about consistency.
                    cosistent hard work gains success.
                </p>
                <a href="#" class="btn">Explore Now &#8594;</a>
            </div>
            <div class="col-2">
                <img src="img/logo2.PNG">
            </div>
        </div>
        <jsp:include page="foot.jsp"></jsp:include>
    </body>
</html>