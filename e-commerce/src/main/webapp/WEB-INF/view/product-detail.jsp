
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
    <meta charset = "UTF-8">
    <meta name = "viewport" content="width=device-width, initial-scale=1.0">
    <title>Detail Products </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"  type="text/css">
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&family=Roboto:wght@400;700&display=swap"
            rel="stylesheet"
    />


</head>
<body>
<jsp:include page="../../head.jsp"></jsp:include>
<!-----------------------single product details--------------->

<div class="small-container single-product">
    <div class="row">
        <div class="col-2" >

            <img src="img/${produit.photos}"/>
            <div class="small-img-row">
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col" >
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
                <div class= "small-img-col">
                    <img src= "#" width="100%" class="small-img">
                </div>
            </div>
        </div>
        <div class="col-2">


            <h1>${produit.nomProduit}</h1>
            <h4>${produit.prix}</h4>
            <select>
                <option>Select Size</option>
                <option>38</option>
                <option>40</option>
                <option>42</option>
                <option>44</option>
                <option>46</option>
            </select>
            <input type="number" name="quantite" value="1">
            <a href="cart?idProduit=${produits.idProduit}&nomProduit=${produits.nomProduit}&prix=${produits.prix}&description=${produits.description}&photos=${produits.photos}&couleur=${produits.couleur}&quantite=${value}" class="btn">Add To Cart</a>
            <h3>Product Details <i class ="fa fa-ident">
            </i></h3>
            <p>
                ${produit.description}
            </p>
        </div>


    </div>

</div>

</div>

<!---------------------------------footer---------------------->
<jsp:include page="../../foot.jsp"></jsp:include>
</body>
</html>