<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 27.05.2022
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link href="theme/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="theme/css/sb-admin-2.min.css" rel="stylesheet">

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
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
               aria-expanded="true" aria-controls="collapseTwo">
                <i class="fas fa-fw fa-cog"></i>
                <span>Oblicz</span>
            </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Kalkulatory</h6>
                    <a class="collapse-item" href="/count_BMI">BMI</a>
                    <a class="collapse-item" href="/create_personData">Zapotrzebowanie</a>
                </div>
            </div>
        </li>

        <!-- Nav Item - Utilities Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link" href="/planMeals/Poniedziałek">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Zaplanuj posiłki</span></a>
        </li>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
            <%--                <div class="bg-white py-2 collapse-inner rounded">--%>
            <%--                    <h6 class="collapse-header">Custom Utilities:</h6>--%>
            <%--                    <a class="collapse-item" href="theme/utilities-color.html">Colors</a>--%>
            <%--                    <a class="collapse-item" href="theme/utilities-border.html">Borders</a>--%>
            <%--                    <a class="collapse-item" href="theme/utilities-animation.html">Animations</a>--%>
            <%--                    <a class="collapse-item" href="theme/utilities-other.html">Other</a>--%>
            <%--                </div>--%>
        </div>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Addons
        </div>

        <!-- Nav Item - Pages Collapse Menu -->
        <%--        <li class="nav-item">--%>
        <%--            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">--%>
        <%--                <i class="fas fa-fw fa-folder"></i>--%>
        <%--                <span>Pages</span>--%>
        <%--            </a>--%>
        <%--            <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">--%>
        <%--                <div class="bg-white py-2 collapse-inner rounded">--%>
        <%--                    <h6 class="collapse-header">Login Screens:</h6>--%>
        <%--                    <a class="collapse-item" href="theme/login.html">Login</a>--%>
        <%--                    <a class="collapse-item" href="theme/register.html">Register</a>--%>
        <%--                    <a class="collapse-item" href="theme/forgot-password.html">Forgot Password</a>--%>
        <%--                    <div class="collapse-divider"></div>--%>
        <%--                    <h6 class="collapse-header">Other Pages:</h6>--%>
        <%--                    <a class="collapse-item" href="theme/404.html">404 Page</a>--%>
        <%--                    <a class="collapse-item" href="theme/blank.html">Blank Page</a>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--        </li>--%>

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

                <!-- Topbar Search -->
<%--                <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">--%>
<%--                    <div class="input-group">--%>
<%--                        <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."--%>
<%--                               aria-label="Search" aria-describedby="basic-addon2">--%>
<%--                        <div class="input-group-append">--%>
<%--                            <button class="btn btn-primary" type="button">--%>
<%--                                <i class="fas fa-search fa-sm"></i>--%>
<%--                            </button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </form>--%>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                    <li class="nav-item dropdown no-arrow d-sm-none">
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                             aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small"
                                           placeholder="Search for..." aria-label="Search"
                                           aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fas fa-search fa-sm"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </li>


                    <div class="topbar-divider d-none d-sm-block"></div>
                    <a class="mr-2 d-none d-lg-inline text-gray-600" href="<c:url value="/logout" />">Wyloguj</a>
<%--                    <!-- Nav Item - User Information -->--%>
<%--                    <li class="nav-item dropdown no-arrow">--%>
<%--                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"--%>
<%--                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                            <span class="mr-2 d-none d-lg-inline text-gray-600 small">Valerie Luna</span>--%>
<%--                            <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">--%>
<%--                        </a>--%>
<%--                        <!-- Dropdown - User Information -->--%>
<%--                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"--%>
<%--                             aria-labelledby="userDropdown">--%>
<%--                            <a class="dropdown-item" href="#">--%>
<%--                                <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>--%>
<%--                                Profile--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item" href="#">--%>
<%--                                <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>--%>
<%--                                Settings--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item" href="#">--%>
<%--                                <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>--%>
<%--                                Activity Log--%>
<%--                            </a>--%>
<%--                            <div class="dropdown-divider"></div>--%>
<%--                            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">--%>
<%--                                <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>--%>
<%--                                Logout--%>
<%--                            </a>--%>
<%--                        </div>--%>
<%--                    </li>--%>

                </ul>

            </nav>


            <!-- Begin Page Content -->
            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
<%--                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>--%>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-left">
                                    <h1 class="h4 text-gray-900 mb-4">Dodaj produkt do bazy:</h1>
                                    <p class="h6 text-gray-900 mb-4">Podaj wartość energetyczną i wartości odżywcze w przeliczeniu na 100g produktu!</p>
                                </div>
                    <spring:form action="/addProduct" modelAttribute="createProductForm" method="post">
                    <div class="form-group">
                        <label>Nazwa produktu:
                            <spring:input path="productName"/><br>
                            <spring:errors path="productName"/>
                        </label><br>
                    </div>
                    <div class="form-group">
                        <label>Wartość energetyczna [kcal]:
                            <spring:input path="energyValue"/><br>
                            <spring:errors path="energyValue"/></label><br>
                    </div>
                    <div class="form-group">
                        <label>Ilość białka [g]:
                            <spring:input path="protein"/><br>
                            <spring:errors path="protein"/></label><br>
                    </div>
                    <div class="form-group">
                        <label>Ilość węglowodanów [g]:
                            <spring:input path="carbohydrates"/><br>
                            <spring:errors path="carbohydrates"/></label><br>
                    </div>
                    <div class="form-group">
                        <label>Ilość tłuszczu [g]:
                            <spring:input path="fats"/><br>
                            <spring:errors path="fats"/></label><br>
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <label>Waga produktu [g]:--%>
<%--                            <spring:input path="weight"/><br>--%>
<%--                            <spring:errors path="weight"/><</label><br>--%>
<%--                    </div>--%>

                    <div class="form-group">
                        <spring:button>Dodaj</spring:button>
                    </div>
                    <div class="form-group">
                        </spring:form>
                        <hr>
                        <%--                <!-- Page Heading -->--%>
                        <%--                <h1 class="h3 mb-2 text-gray-800">Menu na dziś</h1>--%>
                        <%--                <p class="mb-4">Poniżej znajdują się posiłki, jakie na dziś zaplanowałeś ☺</p>--%>

                        <%--                <!-- DataTales Example -->--%>
                        <%--                <div class="card shadow mb-4">--%>
                        <%--                    <div class="card-header py-3">--%>
                        <%--                        <h6 class="m-0 font-weight-bold text-primary">Śniadanie (NAZWA POSIŁKU DYNAMICZNIE)</h6>--%>
                        <%--                    </div>--%>
                        <%--                    <div class="card-body">--%>
                        <%--                        <div class="table-responsive">--%>
                        <%--                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">--%>
                        <%--                                <thead>--%>
                        <%--                                <tr>--%>
                        <%--                                    <th>Składnik</th>--%>
                        <%--                                    <th>Gramatura</th>--%>
                        <%--                                    <th>Ilość kalorii</th>--%>
                        <%--                                    <th>Ilość białka</th>--%>
                        <%--                                    <th>Ilość węglowodanów</th>--%>
                        <%--                                    <th>Ilość tłuszczu</th>--%>
                        <%--                                </tr>--%>
                        <%--                                </thead>--%>

                        <%--                                <tbody>--%>
                        <%--                                <tr>--%>
                        <%--                                    <td>Składnik -dynamicznie</td>--%>
                        <%--                                    <td>Gramatura -dynamicznie</td>--%>
                        <%--                                    <td>kalorie - dynamicznie</td>--%>
                        <%--                                    <td>białko - dynamicznie</td>--%>
                        <%--                                    <td>węgle- dynamicznie</td>--%>
                        <%--                                    <td>tłuszcz - dynamicznie</td>--%>
                        <%--                                </tr>--%>

                        <%--                                </tbody>--%>
                        <%--                            </table>--%>
                        <%--                        </div>--%>
                        <%--                    </div>--%>
                        <%--                </div>--%>

                    </div>
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
            </div>
        </div>
    </div>
</div>
</body>

</html>
