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
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

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
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
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
            <a class="nav-link" href="theme/tables.html">
                <i class="fas fa-fw fa-table"></i>
                <span>Edytuj dane</span></a>
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
<%--                        <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">--%>
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
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fas fa-search fa-sm"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </li>

<%--                    <!-- Nav Item - Alerts -->--%>
<%--                    <li class="nav-item dropdown no-arrow mx-1">--%>
<%--                        <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                            <i class="fas fa-bell fa-fw"></i>--%>
<%--                            <!-- Counter - Alerts -->--%>
<%--                            <span class="badge badge-danger badge-counter">3+</span>--%>
<%--                        </a>--%>
<%--                        <!-- Dropdown - Alerts -->--%>
<%--                        <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="alertsDropdown">--%>
<%--                            <h6 class="dropdown-header">--%>
<%--                                Alerts Center--%>
<%--                            </h6>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="mr-3">--%>
<%--                                    <div class="icon-circle bg-primary">--%>
<%--                                        <i class="fas fa-file-alt text-white"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="small text-gray-500">December 12, 2019</div>--%>
<%--                                    <span class="font-weight-bold">A new monthly report is ready to download!</span>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="mr-3">--%>
<%--                                    <div class="icon-circle bg-success">--%>
<%--                                        <i class="fas fa-donate text-white"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="small text-gray-500">December 7, 2019</div>--%>
<%--                                    $290.29 has been deposited into your account!--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="mr-3">--%>
<%--                                    <div class="icon-circle bg-warning">--%>
<%--                                        <i class="fas fa-exclamation-triangle text-white"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="small text-gray-500">December 2, 2019</div>--%>
<%--                                    Spending Alert: We've noticed unusually high spending for your account.--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>--%>
<%--                        </div>--%>
<%--                    </li>--%>

<%--                    <!-- Nav Item - Messages -->--%>
<%--                    <li class="nav-item dropdown no-arrow mx-1">--%>
<%--                        <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                            <i class="fas fa-envelope fa-fw"></i>--%>
<%--                            <!-- Counter - Messages -->--%>
<%--                            <span class="badge badge-danger badge-counter">7</span>--%>
<%--                        </a>--%>
<%--                        <!-- Dropdown - Messages -->--%>
<%--                        <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="messagesDropdown">--%>
<%--                            <h6 class="dropdown-header">--%>
<%--                                Message Center--%>
<%--                            </h6>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="dropdown-list-image mr-3">--%>
<%--                                    <img class="rounded-circle" src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">--%>
<%--                                    <div class="status-indicator bg-success"></div>--%>
<%--                                </div>--%>
<%--                                <div class="font-weight-bold">--%>
<%--                                    <div class="text-truncate">Hi there! I am wondering if you can help me with a problem I've been having.</div>--%>
<%--                                    <div class="small text-gray-500">Emily Fowler · 58m</div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="dropdown-list-image mr-3">--%>
<%--                                    <img class="rounded-circle" src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">--%>
<%--                                    <div class="status-indicator"></div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="text-truncate">I have the photos that you ordered last month, how would you like them sent to you?</div>--%>
<%--                                    <div class="small text-gray-500">Jae Chun · 1d</div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="dropdown-list-image mr-3">--%>
<%--                                    <img class="rounded-circle" src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">--%>
<%--                                    <div class="status-indicator bg-warning"></div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="text-truncate">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>--%>
<%--                                    <div class="small text-gray-500">Morgan Alvarez · 2d</div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item d-flex align-items-center" href="#">--%>
<%--                                <div class="dropdown-list-image mr-3">--%>
<%--                                    <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">--%>
<%--                                    <div class="status-indicator bg-success"></div>--%>
<%--                                </div>--%>
<%--                                <div>--%>
<%--                                    <div class="text-truncate">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>--%>
<%--                                    <div class="small text-gray-500">Chicken the Dog · 2w</div>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>--%>
<%--                        </div>--%>
<%--                    </li>--%>

                    <div class="topbar-divider d-none d-sm-block"></div>
                    <a class="mr-2 d-none d-lg-inline text-gray-600" href="<c:url value="/logout" />">Wyloguj</a>

<%--                    <!-- Nav Item - User Information -->--%>
<%--                    <li class="nav-item dropdown no-arrow">--%>
<%--                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                            <span class="mr-2 d-none d-lg-inline text-gray-600 small">Valerie Luna</span>--%>
<%--                            <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">--%>
<%--                        </a>--%>
<%--                        <!-- Dropdown - User Information -->--%>
<%--                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">--%>
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
<%--            <!-- End of Topbar -->--%>

<%--            <!-- Begin Page Content -->--%>
<%--            <div class="container-fluid">--%>

<%--                <!-- Page Heading -->--%>
<%--                <div class="d-sm-flex align-items-center justify-content-between mb-4">--%>
<%--                    <h1 class="h3 mb-0 text-gray-800">Menu na dziś!</h1>--%>
<%--                    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>--%>
<%--                </div>--%>

                <!-- Content Row -->
<%--                <div class="row">--%>

<%--                    <!-- Earnings (Monthly) Card Example -->--%>
<%--                    <div class="col-xl-3 col-md-6 mb-4">--%>
<%--                        <div class="card border-left-primary shadow h-100 py-2">--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="row no-gutters align-items-center">--%>
<%--                                    <div class="col mr-2">--%>
<%--&lt;%&ndash;                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">Dodaj produkt</div>&ndash;%&gt;--%>
<%--                                        <div class="h5 mb-0 font-weight-bold text-gray-800">Dodaj produkt</div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-auto">--%>
<%--                                        <i class="fas fa-calendar fa-2x text-gray-300"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <!-- Earnings (Monthly) Card Example -->--%>
<%--                    <div class="col-xl-3 col-md-6 mb-4">--%>
<%--                        <div class="card border-left-success shadow h-100 py-2">--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="row no-gutters align-items-center">--%>
<%--                                    <div class="col mr-2">--%>
<%--                                        <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Earnings (Annual)</div>--%>
<%--                                        <div class="h5 mb-0 font-weight-bold text-gray-800">$215,000</div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-auto">--%>
<%--                                        <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <!-- Earnings (Monthly) Card Example -->--%>
<%--                    <div class="col-xl-3 col-md-6 mb-4">--%>
<%--                        <div class="card border-left-info shadow h-100 py-2">--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="row no-gutters align-items-center">--%>
<%--                                    <div class="col mr-2">--%>
<%--                                        <div class="text-xs font-weight-bold text-info text-uppercase mb-1">Tasks</div>--%>
<%--                                        <div class="row no-gutters align-items-center">--%>
<%--                                            <div class="col-auto">--%>
<%--                                                <div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">50%</div>--%>
<%--                                            </div>--%>
<%--                                            <div class="col">--%>
<%--                                                <div class="progress progress-sm mr-2">--%>
<%--                                                    <div class="progress-bar bg-info" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-auto">--%>
<%--                                        <i class="fas fa-clipboard-list fa-2x text-gray-300"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <!-- Pending Requests Card Example -->--%>
<%--                    <div class="col-xl-3 col-md-6 mb-4">--%>
<%--                        <div class="card border-left-warning shadow h-100 py-2">--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="row no-gutters align-items-center">--%>
<%--                                    <div class="col mr-2">--%>
<%--                                        <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">Pending Requests</div>--%>
<%--                                        <div class="h5 mb-0 font-weight-bold text-gray-800">18</div>--%>
<%--                                    </div>--%>
<%--                                    <div class="col-auto">--%>
<%--                                        <i class="fas fa-comments fa-2x text-gray-300"></i>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Menu na dziś</h1>
                    <p class="mb-4">Poniżej znajdują się posiłki, jakie na dziś zaplanowałeś ☺</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Śniadanie</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Składnik</th>
                                        <th>Gramatura</th>
                                        <th>Ilość kalorii</th>
                                        <th>Ilość białka</th>
                                        <th>Ilość węglowodanów</th>
                                        <th>Ilość tłuszczu</th>
                                    </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                        <th>Śniadanie</th>
                                        <th>Razem</th>
                                        <th>Dynamicznie ilosć kalorii razem</th>
                                        <th>Dynamicznie ilosć białka razem</th>
                                        <th>Dynamicznie ilosć wegli razem</th>
                                        <th>Dynamicznie ilosć tłuszczu razem</th>
                                    </tr>
                                    </tfoot>
                                    <tbody>
                                    <tr>
                                        <td>Składnik -dynamicznie</td>
                                        <td>Gramatura -dynamicznie</td>
                                        <td>kalorie - dynamicznie</td>
                                        <td>białko - dynamicznie</td>
                                        <td>węgle- dynamicznie</td>
                                        <td>tłuszcz - dynamicznie</td>
                                    </tr>
<%--                                    <tr>--%>
<%--                                        <td>Garrett Winters</td>--%>
<%--                                        <td>Accountant</td>--%>
<%--                                        <td>Tokyo</td>--%>
<%--                                        <td>63</td>--%>
<%--                                        <td>2011/07/25</td>--%>
<%--                                        <td>$170,750</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Ashton Cox</td>--%>
<%--                                        <td>Junior Technical Author</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>66</td>--%>
<%--                                        <td>2009/01/12</td>--%>
<%--                                        <td>$86,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Cedric Kelly</td>--%>
<%--                                        <td>Senior Javascript Developer</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>22</td>--%>
<%--                                        <td>2012/03/29</td>--%>
<%--                                        <td>$433,060</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Airi Satou</td>--%>
<%--                                        <td>Accountant</td>--%>
<%--                                        <td>Tokyo</td>--%>
<%--                                        <td>33</td>--%>
<%--                                        <td>2008/11/28</td>--%>
<%--                                        <td>$162,700</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Brielle Williamson</td>--%>
<%--                                        <td>Integration Specialist</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>61</td>--%>
<%--                                        <td>2012/12/02</td>--%>
<%--                                        <td>$372,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Herrod Chandler</td>--%>
<%--                                        <td>Sales Assistant</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>59</td>--%>
<%--                                        <td>2012/08/06</td>--%>
<%--                                        <td>$137,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Rhona Davidson</td>--%>
<%--                                        <td>Integration Specialist</td>--%>
<%--                                        <td>Tokyo</td>--%>
<%--                                        <td>55</td>--%>
<%--                                        <td>2010/10/14</td>--%>
<%--                                        <td>$327,900</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Colleen Hurst</td>--%>
<%--                                        <td>Javascript Developer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>39</td>--%>
<%--                                        <td>2009/09/15</td>--%>
<%--                                        <td>$205,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Sonya Frost</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>23</td>--%>
<%--                                        <td>2008/12/13</td>--%>
<%--                                        <td>$103,600</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jena Gaines</td>--%>
<%--                                        <td>Office Manager</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>30</td>--%>
<%--                                        <td>2008/12/19</td>--%>
<%--                                        <td>$90,560</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Quinn Flynn</td>--%>
<%--                                        <td>Support Lead</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>22</td>--%>
<%--                                        <td>2013/03/03</td>--%>
<%--                                        <td>$342,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Charde Marshall</td>--%>
<%--                                        <td>Regional Director</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>36</td>--%>
<%--                                        <td>2008/10/16</td>--%>
<%--                                        <td>$470,600</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Haley Kennedy</td>--%>
<%--                                        <td>Senior Marketing Designer</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>43</td>--%>
<%--                                        <td>2012/12/18</td>--%>
<%--                                        <td>$313,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Tatyana Fitzpatrick</td>--%>
<%--                                        <td>Regional Director</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>19</td>--%>
<%--                                        <td>2010/03/17</td>--%>
<%--                                        <td>$385,750</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Michael Silva</td>--%>
<%--                                        <td>Marketing Designer</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>66</td>--%>
<%--                                        <td>2012/11/27</td>--%>
<%--                                        <td>$198,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Paul Byrd</td>--%>
<%--                                        <td>Chief Financial Officer (CFO)</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>64</td>--%>
<%--                                        <td>2010/06/09</td>--%>
<%--                                        <td>$725,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Gloria Little</td>--%>
<%--                                        <td>Systems Administrator</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>59</td>--%>
<%--                                        <td>2009/04/10</td>--%>
<%--                                        <td>$237,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Bradley Greer</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>41</td>--%>
<%--                                        <td>2012/10/13</td>--%>
<%--                                        <td>$132,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Dai Rios</td>--%>
<%--                                        <td>Personnel Lead</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>35</td>--%>
<%--                                        <td>2012/09/26</td>--%>
<%--                                        <td>$217,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jenette Caldwell</td>--%>
<%--                                        <td>Development Lead</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>30</td>--%>
<%--                                        <td>2011/09/03</td>--%>
<%--                                        <td>$345,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Yuri Berry</td>--%>
<%--                                        <td>Chief Marketing Officer (CMO)</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>40</td>--%>
<%--                                        <td>2009/06/25</td>--%>
<%--                                        <td>$675,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Caesar Vance</td>--%>
<%--                                        <td>Pre-Sales Support</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>21</td>--%>
<%--                                        <td>2011/12/12</td>--%>
<%--                                        <td>$106,450</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Doris Wilder</td>--%>
<%--                                        <td>Sales Assistant</td>--%>
<%--                                        <td>Sidney</td>--%>
<%--                                        <td>23</td>--%>
<%--                                        <td>2010/09/20</td>--%>
<%--                                        <td>$85,600</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Angelica Ramos</td>--%>
<%--                                        <td>Chief Executive Officer (CEO)</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>47</td>--%>
<%--                                        <td>2009/10/09</td>--%>
<%--                                        <td>$1,200,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Gavin Joyce</td>--%>
<%--                                        <td>Developer</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>42</td>--%>
<%--                                        <td>2010/12/22</td>--%>
<%--                                        <td>$92,575</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jennifer Chang</td>--%>
<%--                                        <td>Regional Director</td>--%>
<%--                                        <td>Singapore</td>--%>
<%--                                        <td>28</td>--%>
<%--                                        <td>2010/11/14</td>--%>
<%--                                        <td>$357,650</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Brenden Wagner</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>28</td>--%>
<%--                                        <td>2011/06/07</td>--%>
<%--                                        <td>$206,850</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Fiona Green</td>--%>
<%--                                        <td>Chief Operating Officer (COO)</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>48</td>--%>
<%--                                        <td>2010/03/11</td>--%>
<%--                                        <td>$850,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Shou Itou</td>--%>
<%--                                        <td>Regional Marketing</td>--%>
<%--                                        <td>Tokyo</td>--%>
<%--                                        <td>20</td>--%>
<%--                                        <td>2011/08/14</td>--%>
<%--                                        <td>$163,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Michelle House</td>--%>
<%--                                        <td>Integration Specialist</td>--%>
<%--                                        <td>Sidney</td>--%>
<%--                                        <td>37</td>--%>
<%--                                        <td>2011/06/02</td>--%>
<%--                                        <td>$95,400</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Suki Burks</td>--%>
<%--                                        <td>Developer</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>53</td>--%>
<%--                                        <td>2009/10/22</td>--%>
<%--                                        <td>$114,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Prescott Bartlett</td>--%>
<%--                                        <td>Technical Author</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>27</td>--%>
<%--                                        <td>2011/05/07</td>--%>
<%--                                        <td>$145,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Gavin Cortez</td>--%>
<%--                                        <td>Team Leader</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>22</td>--%>
<%--                                        <td>2008/10/26</td>--%>
<%--                                        <td>$235,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Martena Mccray</td>--%>
<%--                                        <td>Post-Sales support</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>46</td>--%>
<%--                                        <td>2011/03/09</td>--%>
<%--                                        <td>$324,050</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Unity Butler</td>--%>
<%--                                        <td>Marketing Designer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>47</td>--%>
<%--                                        <td>2009/12/09</td>--%>
<%--                                        <td>$85,675</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Howard Hatfield</td>--%>
<%--                                        <td>Office Manager</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>51</td>--%>
<%--                                        <td>2008/12/16</td>--%>
<%--                                        <td>$164,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Hope Fuentes</td>--%>
<%--                                        <td>Secretary</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>41</td>--%>
<%--                                        <td>2010/02/12</td>--%>
<%--                                        <td>$109,850</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Vivian Harrell</td>--%>
<%--                                        <td>Financial Controller</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>62</td>--%>
<%--                                        <td>2009/02/14</td>--%>
<%--                                        <td>$452,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Timothy Mooney</td>--%>
<%--                                        <td>Office Manager</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>37</td>--%>
<%--                                        <td>2008/12/11</td>--%>
<%--                                        <td>$136,200</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jackson Bradshaw</td>--%>
<%--                                        <td>Director</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>65</td>--%>
<%--                                        <td>2008/09/26</td>--%>
<%--                                        <td>$645,750</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Olivia Liang</td>--%>
<%--                                        <td>Support Engineer</td>--%>
<%--                                        <td>Singapore</td>--%>
<%--                                        <td>64</td>--%>
<%--                                        <td>2011/02/03</td>--%>
<%--                                        <td>$234,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Bruno Nash</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>38</td>--%>
<%--                                        <td>2011/05/03</td>--%>
<%--                                        <td>$163,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Sakura Yamamoto</td>--%>
<%--                                        <td>Support Engineer</td>--%>
<%--                                        <td>Tokyo</td>--%>
<%--                                        <td>37</td>--%>
<%--                                        <td>2009/08/19</td>--%>
<%--                                        <td>$139,575</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Thor Walton</td>--%>
<%--                                        <td>Developer</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>61</td>--%>
<%--                                        <td>2013/08/11</td>--%>
<%--                                        <td>$98,540</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Finn Camacho</td>--%>
<%--                                        <td>Support Engineer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>47</td>--%>
<%--                                        <td>2009/07/07</td>--%>
<%--                                        <td>$87,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Serge Baldwin</td>--%>
<%--                                        <td>Data Coordinator</td>--%>
<%--                                        <td>Singapore</td>--%>
<%--                                        <td>64</td>--%>
<%--                                        <td>2012/04/09</td>--%>
<%--                                        <td>$138,575</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Zenaida Frank</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>63</td>--%>
<%--                                        <td>2010/01/04</td>--%>
<%--                                        <td>$125,250</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Zorita Serrano</td>--%>
<%--                                        <td>Software Engineer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>56</td>--%>
<%--                                        <td>2012/06/01</td>--%>
<%--                                        <td>$115,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jennifer Acosta</td>--%>
<%--                                        <td>Junior Javascript Developer</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>43</td>--%>
<%--                                        <td>2013/02/01</td>--%>
<%--                                        <td>$75,650</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Cara Stevens</td>--%>
<%--                                        <td>Sales Assistant</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>46</td>--%>
<%--                                        <td>2011/12/06</td>--%>
<%--                                        <td>$145,600</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Hermione Butler</td>--%>
<%--                                        <td>Regional Director</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>47</td>--%>
<%--                                        <td>2011/03/21</td>--%>
<%--                                        <td>$356,250</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Lael Greer</td>--%>
<%--                                        <td>Systems Administrator</td>--%>
<%--                                        <td>London</td>--%>
<%--                                        <td>21</td>--%>
<%--                                        <td>2009/02/27</td>--%>
<%--                                        <td>$103,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Jonas Alexander</td>--%>
<%--                                        <td>Developer</td>--%>
<%--                                        <td>San Francisco</td>--%>
<%--                                        <td>30</td>--%>
<%--                                        <td>2010/07/14</td>--%>
<%--                                        <td>$86,500</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Shad Decker</td>--%>
<%--                                        <td>Regional Director</td>--%>
<%--                                        <td>Edinburgh</td>--%>
<%--                                        <td>51</td>--%>
<%--                                        <td>2008/11/13</td>--%>
<%--                                        <td>$183,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Michael Bruce</td>--%>
<%--                                        <td>Javascript Developer</td>--%>
<%--                                        <td>Singapore</td>--%>
<%--                                        <td>29</td>--%>
<%--                                        <td>2011/06/27</td>--%>
<%--                                        <td>$183,000</td>--%>
<%--                                    </tr>--%>
<%--                                    <tr>--%>
<%--                                        <td>Donna Snider</td>--%>
<%--                                        <td>Customer Support</td>--%>
<%--                                        <td>New York</td>--%>
<%--                                        <td>27</td>--%>
<%--                                        <td>2011/01/25</td>--%>
<%--                                        <td>$112,000</td>--%>
<%--                                    </tr>--%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

<%--                    <!-- Pie Chart -->--%>
<%--                    <div class="col-xl-4 col-lg-5">--%>
<%--                        <div class="card shadow mb-4">--%>
<%--                            <!-- Card Header - Dropdown -->--%>
<%--                            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">--%>
<%--                                <h6 class="m-0 font-weight-bold text-primary">Revenue Sources</h6>--%>
<%--                                <div class="dropdown no-arrow">--%>
<%--                                    <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                                        <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>--%>
<%--                                    </a>--%>
<%--                                    <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in" aria-labelledby="dropdownMenuLink">--%>
<%--                                        <div class="dropdown-header">Dropdown Header:</div>--%>
<%--                                        <a class="dropdown-item" href="#">Action</a>--%>
<%--                                        <a class="dropdown-item" href="#">Another action</a>--%>
<%--                                        <div class="dropdown-divider"></div>--%>
<%--                                        <a class="dropdown-item" href="#">Something else here</a>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <!-- Card Body -->--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="chart-pie pt-4 pb-2">--%>
<%--                                    <canvas id="myPieChart"></canvas>--%>
<%--                                </div>--%>
<%--                                <div class="mt-4 text-center small">--%>
<%--                    <span class="mr-2">--%>
<%--                      <i class="fas fa-circle text-primary"></i> Direct--%>
<%--                    </span>--%>
<%--                                    <span class="mr-2">--%>
<%--                      <i class="fas fa-circle text-success"></i> Social--%>
<%--                    </span>--%>
<%--                                    <span class="mr-2">--%>
<%--                      <i class="fas fa-circle text-info"></i> Referral--%>
<%--                    </span>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--                <!-- Content Row -->--%>
<%--                <div class="row">--%>

<%--                    <!-- Content Column -->--%>
<%--                    <div class="col-lg-6 mb-4">--%>

<%--                        <!-- Project Card Example -->--%>
<%--                        <div class="card shadow mb-4">--%>
<%--                            <div class="card-header py-3">--%>
<%--                                <h6 class="m-0 font-weight-bold text-primary">Projects</h6>--%>
<%--                            </div>--%>
<%--                            <div class="card-body">--%>
<%--                                <h4 class="small font-weight-bold">Server Migration <span class="float-right">20%</span></h4>--%>
<%--                                <div class="progress mb-4">--%>
<%--                                    <div class="progress-bar bg-danger" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                </div>--%>
<%--                                <h4 class="small font-weight-bold">Sales Tracking <span class="float-right">40%</span></h4>--%>
<%--                                <div class="progress mb-4">--%>
<%--                                    <div class="progress-bar bg-warning" role="progressbar" style="width: 40%" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                </div>--%>
<%--                                <h4 class="small font-weight-bold">Customer Database <span class="float-right">60%</span></h4>--%>
<%--                                <div class="progress mb-4">--%>
<%--                                    <div class="progress-bar" role="progressbar" style="width: 60%" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                </div>--%>
<%--                                <h4 class="small font-weight-bold">Payout Details <span class="float-right">80%</span></h4>--%>
<%--                                <div class="progress mb-4">--%>
<%--                                    <div class="progress-bar bg-info" role="progressbar" style="width: 80%" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                </div>--%>
<%--                                <h4 class="small font-weight-bold">Account Setup <span class="float-right">Complete!</span></h4>--%>
<%--                                <div class="progress">--%>
<%--                                    <div class="progress-bar bg-success" role="progressbar" style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                        <!-- Color System -->--%>
<%--                        <div class="row">--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-primary text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Primary--%>
<%--                                        <div class="text-white-50 small">#4e73df</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-success text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Success--%>
<%--                                        <div class="text-white-50 small">#1cc88a</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-info text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Info--%>
<%--                                        <div class="text-white-50 small">#36b9cc</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-warning text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Warning--%>
<%--                                        <div class="text-white-50 small">#f6c23e</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-danger text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Danger--%>
<%--                                        <div class="text-white-50 small">#e74a3b</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-6 mb-4">--%>
<%--                                <div class="card bg-secondary text-white shadow">--%>
<%--                                    <div class="card-body">--%>
<%--                                        Secondary--%>
<%--                                        <div class="text-white-50 small">#858796</div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                    </div>--%>

<%--                    <div class="col-lg-6 mb-4">--%>

<%--                        <!-- Illustrations -->--%>
<%--                        <div class="card shadow mb-4">--%>
<%--                            <div class="card-header py-3">--%>
<%--                                <h6 class="m-0 font-weight-bold text-primary">Illustrations</h6>--%>
<%--                            </div>--%>
<%--                            <div class="card-body">--%>
<%--                                <div class="text-center">--%>
<%--                                    <img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 25rem;" src="theme/img/undraw_posting_photo.svg" alt="">--%>
<%--                                </div>--%>
<%--                                <p>Add some quality, svg illustrations to your project courtesy of <a target="_blank" rel="nofollow" href="https://undraw.co/">unDraw</a>, a constantly updated collection of beautiful svg images that you can use completely free and without attribution!</p>--%>
<%--                                <a target="_blank" rel="nofollow" href="https://undraw.co/">Browse Illustrations on unDraw &rarr;</a>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                        <!-- Approach -->--%>
<%--                        <div class="card shadow mb-4">--%>
<%--                            <div class="card-header py-3">--%>
<%--                                <h6 class="m-0 font-weight-bold text-primary">Development Approach</h6>--%>
<%--                            </div>--%>
<%--                            <div class="card-body">--%>
<%--                                <p>SB Admin 2 makes extensive use of Bootstrap 4 utility classes in order to reduce CSS bloat and poor page performance. Custom CSS classes are used to create custom components and custom utility classes.</p>--%>
<%--                                <p class="mb-0">Before working with this theme, you should become familiar with the Bootstrap framework, especially the utility classes.</p>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                    </div>--%>
<%--                </div>--%>

<%--            </div>--%>
<%--            <!-- /.container-fluid -->--%>

<%--        </div>--%>
<%--        <!-- End of Main Content -->--%>

<%--        <!-- Footer -->--%>
<%--        <footer class="sticky-footer bg-white">--%>
<%--            <div class="container my-auto">--%>
<%--                <div class="copyright text-center my-auto">--%>
<%--                    <span>Copyright &copy; Your Website 2019</span>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </footer>--%>
<%--        <!-- End of Footer -->--%>

<%--    </div>--%>
<%--    <!-- End of Content Wrapper -->--%>

<%--</div>--%>
<%--<!-- End of Page Wrapper -->--%>

<%--<!-- Scroll to Top Button-->--%>
<%--<a class="scroll-to-top rounded" href="#page-top">--%>
<%--    <i class="fas fa-angle-up"></i>--%>
<%--</a>--%>

<%--<!-- Logout Modal-->--%>
<%--<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>--%>
<%--                <button class="close" type="button" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">×</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>--%>
<%--            <div class="modal-footer">--%>
<%--                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>--%>
<%--                <a class="btn btn-primary" href="login.html">Logout</a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>

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
