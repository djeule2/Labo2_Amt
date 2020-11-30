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

        <div class="small-container cart-page">
            <table>
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Subtotal</th>
                </tr>
                <tr>
                    <td>
                        <div class="cart-info">
                            <img src="#">
                            <div>
                                <p>Red Printed Tshirt</p>
                                <small>Price: $50.00</small>
                                <br>
                                <a href="#">Remove</a>
                            </div>
                        </div>
                    </td>

                    <td><input type="number" value = "1"></td>
                    <td>$50.00</td>
                </tr>
                <tr>
                    <td>
                        <div class="cart-info">
                            <img src="#">
                            <div>
                                <p>Red Printed Tshirt</p>
                                <small>Price: $50.00</small>
                                <br>
                                <a href="#">Remove</a>
                            </div>
                        </div>
                    </td>

                    <td><input type="number" value = "1"></td>
                    <td>$50.00</td>
                </tr>
                <tr>
                    <td>
                        <div class="cart-info">
                            <img src="#">
                            <div>
                                <p>Red Printed Tshirt</p>
                                <small>Price: $60.00</small>
                                <br>
                                <a href="#">Remove</a>
                            </div>
                        </div>
                    </td>

                    <td><input type="number" value = "1"></td>
                    <td>$70.00</td>
                </tr>
            </table>
            <div class="total-price">
                <table>
                    <tr>
                        <td>Subtotal</td>
                        <td>$200</td>
                    </tr>
                    <tr>
                        <td>Tax</td>
                        <td>$35.00</td>
                    </tr>
                    <tr>
                        <td>Total</td>
                        <td>$200</td>
                    </tr>
                </table>
            </div>

        </div>
        <jsp:include page="../../foot.jsp"></jsp:include>
    </body>
</html>
