<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 22.05.2022
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="/header.jsp" %>--%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Kalkulator zapotrzebowania</title>
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
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Aby obliczyć swoje aktualne BMI, podaj swój
                                        wzrost oraz aktualną masę ciała.</h1>
                                </div>
                                <spring:form action="/count_BMI" modelAttribute="bmiCalcForm" method="post">
                                <div class="form-group">
                                    <label>Masa ciała [kg]<br>
                                        <spring:input path="bodyWeight"/></label><br>
                                </div>
                                <div class="form-group">
                                    <label>Wzrost [cm]<br>
                                        <spring:input path="bodyHeight"/></label><br>
                                    <div class="form-group">
                                        <spring:button>Oblicz</spring:button>
                                    </div>
                                    <div class="form-group">
                                        </spring:form>
                                        <hr>
                                        <div class="text-center">
                                            <a class="small" href="/create_personData">Oblicz swoje zapotrzebowanie</a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small" href="/planMeals">Zaplanuj posiłki!</a>

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
</div>
</body>

</html>