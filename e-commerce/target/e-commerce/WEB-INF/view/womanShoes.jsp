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
<div class="small-container">
    <div class="row row-2">
        <h2>All Products for woman</h2>
        <select>
            <option>  Default Shorting </option>
            <option>  Short by price </option>
            <option>  Short by popularity </option>
            <option>  Short by rating </option>
            <option>  Short by sale </option>
        </select>
    </div>
            <c:forEach items="${produit}" var="produits">
                <div class="col-4">
                    <a href="product-detail?idProduit=${produits.idProduit}&nomProduit=${produits.nomProduit}&prix=${produits.prix}&description=${produits.description}&photos=${produits.photos}&couleur=${produits.couleur}">
                        <img src="img/${produits.photos}">
                    </a>
                    <h4>${produits.nomProduit} </h4>
                    <p>${produits.prix}</p>

                </div>
            </c:forEach>

    <div class="page-btn">
        <c:if test="${currentPage != 1}">
            <span><a href="womanShoes?page=${currentPage - 1}">&#8592;</a></span>
        </c:if>

        <c:forEach begin="1" end="${noOfPages}" var="i">
            <c:choose>
                <c:when test="${currentPage eq i}">
                    <span>${i} </span>
                </c:when>
                <c:otherwise>
                    <span><a href="womanShoes?page=${i}">${i}</a></span>
                </c:otherwise>
            </c:choose>
        </c:forEach>

        <c:if test="${currentPage lt noOfPages}">
            <span><a href="womanShoes?page=${currentPage + 1}">&#8594;</a> </span>
        </c:if>
    </div>


</div>

<jsp:include page="../../foot.jsp"></jsp:include>
</body>
</html>