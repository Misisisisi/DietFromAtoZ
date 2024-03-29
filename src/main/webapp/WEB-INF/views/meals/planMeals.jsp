<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 22.05.2022
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DietFromAtoZ - Menu</title>

    <!-- Custom fonts for this template-->
    <link href="${pageContext.request.contextPath}/theme/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath}/theme/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/home">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">DietFromAtoZ</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="/home">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Menu</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Interface
        </div>

        <!-- Nav Item - Pages Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link" href="/count_BMI">
                <i class="fas fa-fw fa-cog"></i>
                <span>Oblicz BMI</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/create_personData">
                <i class="fas fa-fw fa-cog"></i>
                <span>Oblicz zapotrzebowanie</span></a>
        </li>
        <!-- Nav Item - Utilities Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link" href="/planMeals/Poniedziałek">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Zaplanuj posiłki</span></a>
        </li>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">

        </div>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Addons
        </div>


        <!-- Nav Item - Charts -->
        <li class="nav-item">
            <a class="nav-link" href="/addProduct">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Dodaj produkt do bazy</span></a>
        </li>

        <!-- Nav Item - Tables -->
        <li class="nav-item">
            <a class="nav-link" href="/data">
                <i class="fas fa-fw fa-table"></i>
                <span>Moje dane</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>


                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">



                    <div class="topbar-divider d-none d-sm-block"></div>
                    <a class="mr-2 d-none d-lg-inline text-gray-600" href="<c:url value="/logout" />">Wyloguj</a>


                </ul>

            </nav>


            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800">Zaplanuj posiłki</h1>
                <spring:form action="/planMeals/editDayName" modelAttribute="nameOfDay" method="post">
                    <label>Wybierz dzień tygodnia:
                    <spring:select path="dayName">
                        <spring:option value="Poniedziałek">Poniedziałek</spring:option>
                        <spring:option value="Wtorek">Wtorek</spring:option>
                        <spring:option value="Środa">Środa</spring:option>
                        <spring:option value="Czwartek">Czwartek</spring:option>
                        <spring:option value="Piątek">Piątek</spring:option>
                        <spring:option value="Sobota">Sobota</spring:option>
                        <spring:option value="Niedziela">Niedziela</spring:option>
                    </spring:select>

                    <spring:button type="submit" name="editDay">Wybierz</spring:button>
                    </label>
                </spring:form>

                <spring:form action="/planMeals" modelAttribute="planMealsForm" method="post">
                <h5>Planujesz posiłki na: ${dayName}
                    <spring:hidden placeholder="Nie wybrałeś/aś dnia" class="m-20 font-weight-bold text-primary" path="dayName" value="${dayName}"/>
                </h5>

                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">TWOJE ZAPOTRZEBOWANIE NA ENERGIĘ ORAZ MAKROSKŁADNIKI</h6>
                    </div>
                    <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="energyTable" width="100%"
                               cellspacing="0">
                            <thead>
                            <tr>

                                <th>Wartość energetyczna [kcal]</th>
                                <th>Ilość białka [g]</th>
                                <th>Ilość węglowodanów [g]</th>
                                <th>Ilość tłuszczu [g]</th>
                            </tr>
                            </thead>

                            <tbody>
                            <tr>

                                <td>${energyValue} kcal</td>
                                <td>${proteinValue} g</td>
                                <td>${carbohydratesValue} g</td>
                                <td>${fatValue} g</td>
                            </tr>

                            </tbody>
                        </table>
                    </div>
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">PODSUMOWANIE DNIA</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="summary" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>${dayName}</th>

                                    <th>Wartość energetyczna [kcal]</th>
                                    <th>Ilość białka [g]</th>
                                    <th>Ilość węglowodanów [g]</th>
                                    <th>Ilość tłuszczu [g]</th>
                                </tr>
                                </thead>
                                </thead>
                                <tfoot>
                                <tr>

                                    <th>Razem</th>
                                    <th>${allDayEnergy} kcal</th>
                                    <th>${allDayProtein} g</th>
                                    <th>${allDayCarbohydrates} g</th>
                                    <th>${allDayFats} g</th>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Śniadanie</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="breakfast" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Składnik</th>
                                    <th>Gramatura [g]</th>
                                    <th>Wartość energetyczna [kcal]</th>
                                    <th>Ilość białka [g]</th>
                                    <th>Ilość węglowodanów [g]</th>
                                    <th>Ilość tłuszczu [g]</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>Śniadanie</th>
                                    <th>Razem</th>
                                    <th>${breakfastEnergy} kcal</th>
                                    <th>${breakfastProtein} g</th>
                                    <th>${breakfastCarbohydrates} g</th>
                                    <th>${breakfastFats} g</th>
                                </tr>
                                </tfoot>
                                    <%--                                <tbody>--%>
                                <tr>

                                    <div class="input-group">
                                        <spring:input path="productName" type="text"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Dodaj produkt..."/>
                                        <spring:input path="weight" type="number"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Podaj gramaturę"/>
                                        <div class="input-group-append">
                                            <spring:button name="addProductToFirstMeal">Dodaj</spring:button>
                                        </div>
                                    </div>
                                    </spring:form>
                                </tr>
                                <c:forEach items="${allByBreakfast}" var="productOfMeal"
                                           varStatus="status">
                                    <tr>
                                        <td>${productOfMeal.productName}</td>
                                        <td><c:out value="${productOfMeal.weight}"/></td>
                                        <td><c:out value="${productOfMeal.energyValue}"/></td>
                                        <td><c:out value="${productOfMeal.protein}"/></td>
                                        <td><c:out value="${productOfMeal.carbohydrates}"/></td>
                                        <td><c:out value="${productOfMeal.fats}"/></td>

                                        <td><spring:form action="/planMeals/${dayName}/remove/${productOfMeal.id}" modelAttribute="planMealsForm"
                                                         method="post">
                                            <form:hidden value="${productOfMeal.id}"/>
                                            <spring:button name="removeProduct">Usuń</spring:button>
                                        </spring:form></td>

                                    </tr>
                                </c:forEach>

                                <%--                                </tbody>--%>
                            </table>
                        </div>
                    </div>
                </div>
                <section id="secondBreakfast">
                <spring:form action="/planMeals" modelAttribute="planMealsForm" method="post">
                <spring:hidden class="m-20 font-weight-bold text-primary" path="dayName" value="${dayName}"/>
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">II śniadanie</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="secondBreakfast" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Składnik</th>
                                    <th>Gramatura [g]</th>
                                    <th>Wartość energetyczna [kcal]</th>
                                    <th>Ilość białka [g]</th>
                                    <th>Ilość węglowodanów [g]</th>
                                    <th>Ilość tłuszczu [g]</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>II śniadanie</th>
                                    <th>Razem</th>
                                    <th>${secondBreakfastEnergy} kcal</th>
                                    <th>${secondBreakfastProtein} g</th>
                                    <th>${secondBreakfastCarbohydrates} g</th>
                                    <th>${secondBreakfastFats} g</th>
                                </tr>
                                </tfoot>
                                    <%--                                <tbody>--%>
                                <tr>

                                    <div class="input-group">
                                        <spring:input path="productName" type="text"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Dodaj produkt..."/>
                                        <spring:input path="weight" type="number"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Podaj gramaturę"/>
                                        <div class="input-group-append">
                                            <spring:button name="addProductToSecondMeal">Dodaj</spring:button>
                                        </div>
                                    </div>
                                    </spring:form>
                                </tr>
                                <c:forEach items="${allBySecondBreakfast}" var="productOfMeal"
                                           varStatus="status">
                                    <tr>
                                        <td>${productOfMeal.productName}</td>
                                        <td><c:out value="${productOfMeal.weight}"/></td>
                                        <td><c:out value="${productOfMeal.energyValue}"/></td>
                                        <td><c:out value="${productOfMeal.protein}"/></td>
                                        <td><c:out value="${productOfMeal.carbohydrates}"/></td>
                                        <td><c:out value="${productOfMeal.fats}"/></td>

                                        <td><spring:form action="/planMeals/${dayName}/remove/${productOfMeal.id}" modelAttribute="planMealsForm"
                                                         method="post">
                                            <form:hidden value="${productOfMeal.id}"/>
                                            <spring:button name="removeProduct">Usuń</spring:button>
                                        </spring:form></td>

                                    </tr>
                                </c:forEach>

                                <%--                                </tbody>--%>
                            </table>
                        </div>
                    </div>
                </div>
                </section>

                <section id="lunch">
                <spring:form action="/planMeals" modelAttribute="planMealsForm" method="post">
                <spring:hidden class="m-20 font-weight-bold text-primary" path="dayName" value="${dayName}"/>
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Obiad</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="lunch" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Składnik</th>
                                    <th>Gramatura [g]</th>
                                    <th>Wartość energetyczna [kcal]</th>
                                    <th>Ilość białka [g]</th>
                                    <th>Ilość węglowodanów [g]</th>
                                    <th>Ilość tłuszczu [g]</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>Obiad</th>
                                    <th>Razem</th>
                                    <th>${lunchEnergy} kcal</th>
                                    <th>${lunchProtein} g</th>
                                    <th>${lunchCarbohydrates} g</th>
                                    <th>${lunchFats} g</th>
                                </tr>
                                </tfoot>
                                    <%--                                <tbody>--%>
                                <tr>

                                    <div class="input-group">
                                        <spring:input path="productName" type="text"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Dodaj produkt..."/>
                                        <spring:input path="weight" type="number"
                                                      class="form-control bg-light border-10 small"
                                                      placeholder="Podaj gramaturę"/>
                                        <div class="input-group-append">
                                            <spring:button name="addProductToThirdMeal">Dodaj</spring:button>
                                        </div>
                                    </div>
                                    </spring:form>
                                </tr>
                                <c:forEach items="${allByLunch}" var="productOfMeal"
                                           varStatus="status">
                                    <tr>
                                        <td>${productOfMeal.productName}</td>
                                        <td><c:out value="${productOfMeal.weight}"/></td>
                                        <td><c:out value="${productOfMeal.energyValue}"/></td>
                                        <td><c:out value="${productOfMeal.protein}"/></td>
                                        <td><c:out value="${productOfMeal.carbohydrates}"/></td>
                                        <td><c:out value="${productOfMeal.fats}"/></td>

                                        <td><spring:form action="/planMeals/${dayName}/remove/${productOfMeal.id}" modelAttribute="planMealsForm"
                                                         method="post">
                                            <form:hidden value="${productOfMeal.id}"/>
                                            <spring:button name="removeProduct">Usuń</spring:button>
                                        </spring:form></td>

                                    </tr>
                                </c:forEach>

                                <%--                                </tbody>--%>
                            </table>
                        </div>
                    </div>
                </div>
                </section>
                <section id="tea">
                    <spring:form action="/planMeals" modelAttribute="planMealsForm" method="post">
                    <spring:hidden class="m-20 font-weight-bold text-primary" path="dayName" value="${dayName}"/>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Podwieczorek</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="tea" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Składnik</th>
                                        <th>Gramatura [g]</th>
                                        <th>Wartość energetyczna [kcal]</th>
                                        <th>Ilość białka [g]</th>
                                        <th>Ilość węglowodanów [g]</th>
                                        <th>Ilość tłuszczu [g]</th>
                                    </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                        <th>Podwieczorek</th>
                                        <th>Razem</th>
                                        <th>${teaEnergy} kcal</th>
                                        <th>${teaProtein} g</th>
                                        <th>${teaCarbohydrates} g</th>
                                        <th>${teaFats} g</th>
                                    </tr>
                                    </tfoot>
                                        <%--                                <tbody>--%>
                                    <tr>

                                        <div class="input-group">
                                            <spring:input path="productName" type="text"
                                                          class="form-control bg-light border-10 small"
                                                          placeholder="Dodaj produkt..."/>
                                            <spring:input path="weight" type="number"
                                                          class="form-control bg-light border-10 small"
                                                          placeholder="Podaj gramaturę"/>
                                            <div class="input-group-append">
                                                <spring:button name="addProductToFourthMeal">Dodaj</spring:button>
                                            </div>
                                        </div>
                                        </spring:form>
                                    </tr>
                                    <c:forEach items="${allByTea}" var="productOfMeal"
                                               varStatus="status">
                                        <tr>
                                            <td>${productOfMeal.productName}</td>
                                            <td><c:out value="${productOfMeal.weight}"/></td>
                                            <td><c:out value="${productOfMeal.energyValue}"/></td>
                                            <td><c:out value="${productOfMeal.protein}"/></td>
                                            <td><c:out value="${productOfMeal.carbohydrates}"/></td>
                                            <td><c:out value="${productOfMeal.fats}"/></td>

                                            <td><spring:form action="/planMeals/${dayName}/remove/${productOfMeal.id}" modelAttribute="planMealsForm"
                                                             method="post">
                                                <form:hidden value="${productOfMeal.id}"/>
                                                <spring:button name="removeProduct">Usuń</spring:button>
                                            </spring:form></td>

                                        </tr>
                                    </c:forEach>

                                    <%--                                </tbody>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>
                <section id="dinner">
                    <spring:form action="/planMeals" modelAttribute="planMealsForm" method="post">
                    <spring:hidden class="m-20 font-weight-bold text-primary" path="dayName" value="${dayName}"/>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Kolacja</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dinner" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Składnik</th>
                                        <th>Gramatura [g]</th>
                                        <th>Wartość energetyczna [kcal]</th>
                                        <th>Ilość białka [g]</th>
                                        <th>Ilość węglowodanów [g]</th>
                                        <th>Ilość tłuszczu [g]</th>
                                    </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                        <th>Kolacja</th>
                                        <th>Razem</th>
                                        <th>${dinnerEnergy} kcal</th>
                                        <th>${dinnerProtein} g</th>
                                        <th>${dinnerCarbohydrates} g</th>
                                        <th>${dinnerFats} g</th>
                                    </tr>
                                    </tfoot>
                                        <%--                                <tbody>--%>
                                    <tr>

                                        <div class="input-group">
                                            <spring:input path="productName" type="text"
                                                          class="form-control bg-light border-10 small"
                                                          placeholder="Dodaj produkt..."/>
                                            <spring:input path="weight" type="number"
                                                          class="form-control bg-light border-10 small"
                                                          placeholder="Podaj gramaturę"/>
                                            <div class="input-group-append">
                                                <spring:button name="addProductToFifthMeal">Dodaj</spring:button>
                                            </div>
                                        </div>
                                        </spring:form>
                                    </tr>
                                    <c:forEach items="${allByDinner}" var="productOfMeal"
                                               varStatus="status">
                                        <tr>
                                            <td>${productOfMeal.productName}</td>
                                            <td><c:out value="${productOfMeal.weight}"/></td>
                                            <td><c:out value="${productOfMeal.energyValue}"/></td>
                                            <td><c:out value="${productOfMeal.protein}"/></td>
                                            <td><c:out value="${productOfMeal.carbohydrates}"/></td>
                                            <td><c:out value="${productOfMeal.fats}"/></td>

                                            <td><spring:form action="/planMeals/${dayName}/remove/${productOfMeal.id}" modelAttribute="planMealsForm"
                                                             method="post">
                                                <form:hidden value="${productOfMeal.id}"/>
                                                <spring:button name="removeProduct">Usuń</spring:button>
                                            </spring:form></td>

                                        </tr>
                                    </c:forEach>

                                    <%--                                </tbody>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>
            <!-- /.container-fluid -->

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="theme/vendor/jquery/jquery.min.js"></script>
        <script src="theme/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="theme/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="theme/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="theme/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="theme/js/demo/chart-area-demo.js"></script>
        <script src="theme/js/demo/chart-pie-demo.js"></script>
    </div>
</div>
</div>

<script> console.log(${dayName})</script>
</body>

</html>