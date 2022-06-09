<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 01.06.2022
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="/header.jsp" %>--%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Zarejestruj się</title>
    <jsp:include page="/header.jsp"/>
</head>

<body class="bg-gradient-primary">

<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <%--                        obrazek pieska --%>
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Cześć! Zarejestruj się!</h1>
                                </div>
                                <spring:form action="/register" modelAttribute="userDetails" method="post">
                                    <div class="form-group">
                                        <spring:input class="form-control form-control-user" placeholder="Imię"
                                                      path="firstName"/>
                                        <spring:errors path="firstName"/>
                                    </div>
                                    <div class="form-group">
                                        <spring:input class="form-control form-control-user" placeholder="Nazwisko"
                                                      path="lastName"/>
                                        <spring:errors path="lastName"/>
                                    </div>
                                    <div class="form-group">
                                        <spring:input class="form-control form-control-user"  placeholder="Login" path="username"/>
                                        <spring:errors path="username"/>
                                    </div>
                                    <div class="form-group">
                                        <spring:input type="email" class="form-control form-control-user" placeholder="Email" path="email"/>
                                        <spring:errors path="email"/>
                                    </div>
                                    <div class="form-group">
                                        <spring:input type="password" class="form-control form-control-user" placeholder="Hasło" path="password"/>
                                        <spring:errors path="password"/>
                                    </div>
                                    <div class="form-group">

                                    </div>
                                    <spring:button class="btn btn-primary btn-user btn-block">Rejestracja</spring:button>

                                </spring:form>
                                <hr>

                                <div class="text-center">
                                    <a class="medium" href="/login">Zaloguj się!</a>
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

</body>

</html>