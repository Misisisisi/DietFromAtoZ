<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 09.06.2022
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="/header.jsp" %>--%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Zaloguj się</title>
    <jsp:include page="/header.jsp"/>
</head>

<body class="bg-gradient-primary">

<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="text-center">
                    <!-- Nested Row within Card Body -->
<%--                    <div class="row">--%>
                        <%--                        obrazek pieska --%>
<%--                        <div class="col-lg-6 d-none d-lg-block bg-register-image"></div>--%>
                        <div class="col-lg-30">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Hurra! Udało Ci się zarejestrować!</h1>
                                </div>

                                    <hr>

                                    <div class="text-center">
                                        <a class="medium" href="/login">A teraz zaloguj się!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>
</div>
</body>

</html>