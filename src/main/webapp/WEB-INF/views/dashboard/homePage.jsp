<%--
  Created by IntelliJ IDEA.
  User: misisisisi
  Date: 23.05.2022
  Time: 16:47
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
               aria-expanded="true"
               aria-controls="collapseTwo">
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


                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                    <li class="nav-item dropdown no-arrow d-sm-none">
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                           data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                             aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small"
                                           placeholder="Search for..."
                                           aria-label="Search" aria-describedby="basic-addon2">
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


                </ul>

            </nav>

            <div>
                <div>
                </div>
                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Witaj w aplikacji DietFromAtoZ!</h1>
                    <%--                    <p class="mb-4">Poniżej znajdują się wartości, jakie na dziś zaplanowałeś ☺</p>--%>

                    <div>
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">

                                <h6 class="m-0 font-weight-bold text-primary">Znasz swój cel żywieniowy? </h6>
                            </div>
                            <div class="card-header py-3">
                                <p class="mb-4">Jeśli nie, w pierwszej kolejności sprawdź swój stan odżywienia.</p>


                                <div class="text-left">
                                    <a class="medium" href="/count_BMI">Sprawdź swój stan odżywienia.</a>
                                </div>
                            </div>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">

                                <h6 class="m-0 font-weight-bold text-primary">Abyś mógł rozpocząć przygodę z aplikacją,
                                    potrzebuję kilka informacji o Tobie. </h6>
                            </div>
                            <div class="card-header py-3">
                                <p class="mb-4"> Jeśli znasz już swój cel żywieniowy, uzupełnij swoje dane potrzebne do
                                    obliczenia
                                    Twojego zapotrzebowania kalorycznego zgodnego z Twoim celem.</p>


                                <div class="text-left">
                                    <a class="medium" href="/create_personData">Uzupełnij swoje dane.</a>
                                </div>
                            </div>
                        </div>

                        <div class="card shadow mb-4">
                            <div class="card-header py-3">

                                <h6 class="m-0 font-weight-bold text-primary">Gdy uzupełniłeś swoje dane, możesz przejść do planowania posiłków według Twojego zapotrzebowania! </h6>
                            </div>
                            <div class="card-header py-3">
                                <p class="mb-4">Wybieraj produkty z bazy, jeśli jakiegoś składnika nie ma w bazie, możesz śmiało dodać swój! Pamiętaj, aby dodawać wartości odżywcze na 100g produktu!</p>


                                <div class="text-left">
                                    <a class="medium" href="/planMeals/Poniedziałek">Zaplanuj posiłki!</a>
                                </div>
                            </div>
                        </div>

                        <div class="card-body">
                            <div class="text-left">
                                <a class="-medium" href="create_personData">Nie podałeś jeszcze swoich danych? Uzupełnij
                                    je
                                    i oblicz swoje zapotrzebowanie.</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <!-- /.container-fluid -->


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

</body>

</html>
