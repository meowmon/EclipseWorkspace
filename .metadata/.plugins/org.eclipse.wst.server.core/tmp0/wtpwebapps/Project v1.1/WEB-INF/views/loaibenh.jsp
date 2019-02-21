<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Collapsible sidebar using Bootstrap 4</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="assets/css/style-menu.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>


    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="assets/css/demo.css" rel="stylesheet" />

</head>

<body>
    <div class="d-block px-3 py-1 text-center text-bold text-white old-bv"></div> 
     <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent no-bg sticky-top  ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-toggle d-inline">
              <button type="button" class="navbar-toggler">
                <span class="navbar-toggler-bar bar1"></span>
                <span class="navbar-toggler-bar bar2"></span>
                <span class="navbar-toggler-bar bar3"></span>
              </button>
            </div>
             <button type="button" id="sidebarCollapse" class="btn more">
                        <i class="fas fa fa-server"></i>
                    </button>
            <p class="navbar-brand" href="#pablo">Quản lý Loại bệnh</p>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>

          <div class="collapse navbar-collapse" id="navigation">
            <ul class="navbar-nav ml-auto ">

              <li class="dropdown nav-item">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                  <div class="photo">
                    <img src="assets/img/anime3.png">
                  </div>
                 
                  <p class="d-lg-none">
                    Log out
                  </p>
                </a>
                <ul class="dropdown-menu dropdown-navbar">
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Profile</a>
                  </li>
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Settings</a>
                  </li>
                  <div class="dropdown-divider"></div>
                  <li class="nav-link">
                    <a href="#" class="nav-item dropdown-item">Log out</a>
                  </li>
                </ul>
              </li>
              <li class="separator d-lg-none"></li>
            </ul>
          </div>
        </div>
      </nav>

    <div class="wrapper">
       
        <!-- Sidebar  -->
        <nav id="sidebar">
        
        <div id="sidebar-cover">
            <div class="sidebar-header">
                    <a href=""><h3>Health care</h3></a> 
            </div>

            <ul class="list-unstyled components">
                <p class="head-title">Thăng Long University</p>
                <li>
                    <a href="trangchu.html">Trang chủ</a>
                </li>
                <li>
                    <a href="khoa.html">Quản lý Khoa</a>
                </li>
                 <li>
                    <a href="bomon.html">Quản lý Bộ Môn</a>
                </li>
                <li>
                    <a href="giaovien.html">Quản lý Giáo viên</a>
                </li>
                <li>
                    <a href="kykham.html">Quản lý Kỳ khám</a>
                </li>
                <li>
                    <a href="hoso.html">Quản lý Hồ sơ khám bệnh</a>
                </li>
                <li class="active">
                    <a href="loaibenh.html">Quản lý Loại bệnh</a>
                </li>
                <li>
                    <a href="benh.html">Quản lý Bệnh</a>
                </li>
                <li>
                    <a href="sucosuckhoe.html">Quản lý Sự cố sức khỏe</a>
                </li>
                <li>
                    <a href="giaoviencankham.html">Quản lý giáo viên cần khám</a>
                </li>
                <li>
                    <a href="thongke.html">Thống kê báo cáo</a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li>
                    <a href="#" class="download">Trợ giúp</a>
                </li>
                <li>
                    <a href="#" class="article">Đội ngũ thiết kế</a>
                </li>
            </ul>
        </div>
        </nav>

        <!-- Page Content  -->
        <div id="content">
        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light bg-light topnav">
                <div class="container-fluid">
                    
                    <li class="nav-item list-item">
                        <a href="them-loaibenh.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-success">
                              <i class="fas fa fa-plus"></i>
                              <span>Thêm loại bệnh</span>
                          </button>
                        </a>
                    </li>
            
                    <li class="nav-item list-item">
                        <div class="search-container">
                            <form action="#">
                              <input class="border" type="text" placeholder="Search.." name="search">
                              <button type="submit"><i class="fa fa-search"></i></button>
                            </form>
                        </div>
                    </li>

                    <li class="nav-item list-item">
                        <button type="button" id="sidebarCollapse" class="btn btn-info">
                            <i class="fas fa-align-left"></i>
                            <span>Danh sách các loại bệnh</span>
                        </button>
                    </li>
                </div>
            </nav>
             <div class="card ">
              <div class="card-header">
                <h4> Danh sách Loại bệnh</h4>
              </div>
               <div class="card-body">
                <div class="table-responsive">
                  <table class="table tablesorter " id="">
                    <thead class=" text-head">
                    <tr>
                      <th scope="col">STT</th>
                      <th scope="col">Tên loại bệnh</th>
                      <th scope="col">Mã</th>
                      <th scope="col">Mô tả</th>
                      <th scope="col">Sửa</th>
                      <th scope="col">Xóa</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th scope="row">1</th>
                      <td>Mark Otto</td>
                      <td></td>
                      <td>Bình thường</td>
                      <td><a href="sua-loaibenh.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-times"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <c:forEach items="${diseaseTypeList}" var="type" >
                    <tr>
			             <th>${type.id}</th>
			             <td>${type.name}</td>
			             <td>DT${type.diseaseTypeId}</td>
			             <td>${type.descrip}</td>
			             <td><a href="${pageContext.request.contextPath}/editDepartment?id=${department.id}"><i class="fas fa fa-edit"></i></a></td><!-- button Sửa -->
			             <td><a href="${pageContext.request.contextPath}/deleteDepartment?id=${department.id}"><i class="fas fa fa-times"></i></a></td><!-- button Xóa -->
                    </tr>
                    </c:forEach>

                  </tbody>
                </table>
            </div>
            
            <div class="line_20"> </div>
            <div class="pagination">
              <a href="#">&laquo;</a>
              <a href="#" class="active">1</a>
              <a href="#">2</a>
              <a href="#">3</a>
              <a href="#">4</a>
              <a href="#">5</a>
              <a href="#">6</a>
              <a href="#">&raquo;</a>
            </div>
        </div>
      </div>
    </div>


             <!-- End Main  --> 

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar, #content').toggleClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>