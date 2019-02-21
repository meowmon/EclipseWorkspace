<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Danh sách giáo viên</title>

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

</head>

<body>

    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3>Hệ thống quản lý sức khỏe giáo viên</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Trường đại học Thăng Long</p>
                <li class="active">
                    <a href="#">Trang chủ</a>
                 <!--
                 <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Quản lý Giáo viên</a>
                    <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Home 1</a>
                        </li>
                        <li>
                            <a href="#">Home 2</a>
                        </li>
                        <li>
                            <a href="#">Home 3</a>
                        </li>
                    </ul>
                 -->
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
                <li>
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
        </nav>

        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fas fa fa-server"></i>
                        <span>Danh mục quản lý</span>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item">
                                <table class="table no-margin">
                            <thead>
                                <tr>
                                    <th>Username</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><a  href="#">Change password</a>&nbsp;/ &nbsp;<a href="logout.jsp">Log out</a></td>
                                </tr>
                                <tr></tr>
                            </tbody>
                        </table>
                            </li>
                            <li class="nav-item">
                                <image class="image-user" src="assets\img\LogoTLU.png"></image>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

                <!-- Main  --> 
                <h3>Quản lý Giáo viên</h3>
                <div class="line_20"></div>
        <div class="">
            <nav class="navbar navbar-expand-lg navbar-light bg-light topnav">
                <div class="container-fluid">
                    
                    <li class="nav-item list-item">
                        <a href="them-giaovien.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-success">
                                  <i class="fas fa fa-plus"></i>
                                  <span>Thêm giáo viên</span>
                          </button>
                        </a>
                    </li>


                    <li class="nav-item list-item">
                       <div class="dropdown show above" >
                          <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Bộ môn
                          </a>

                          <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="#">Bộ môn 1</a>
                            <a class="dropdown-item" href="#">Bộ môn 2</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                          </div>


                        </div>
                    </li>
                    <li class="nav-item list-item">
                        <div class="dropdown show">
                            <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Khoa
                          </a>

                          <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="#">Khoa 1</a>
                            <a class="dropdown-item" href="#">Khoa 2</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                          </div>
                        </div>
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
                                <span>Danh sách tất cả giáo viên</span>
                            </button>
                    </li>
                </div>
            </nav>
            <div>
                <table class="table table-sm align-center">
                  <thead class="thead-light">
                    <tr>
                      <th scope="col">STT</th>
                      <th scope="col">Họ và tên</th>
                      <th scope="col">Mã giáo viên</th>
                      <th scope="col">Ngày sinh</th>
                      <th scope="col">Khoa</th>
                      <th scope="col">Bộ môn</th>
                      <th scope="col">Trạng thái</th>
                      <th scope="col">Chi tiết</th>
                      <th scope="col">Hồ sơ khám</th>
                      <th scope="col">Sửa</th>
                      <th scope="col">Xóa</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th scope="row">1</th>
                      <td>Mark Otto</td>
                      <td>A121</td>
                      <td>1/1/1981</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i  id="button" class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td>Jacob Thornton</td>
                      <td>A122</td>
                      <td>1/2/1982</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">3</th>
                      <td>Larry the Bird</td>
                      <td>A123</td>
                      <td>1/3/1983</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hohosokhamso-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">1</th>
                      <td>Mark Otto</td>
                      <td>A121</td>
                      <td>1/1/1981</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td>Jacob Thornton</td>
                      <td>A122</td>
                      <td>1/2/1982</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">3</th>
                      <td>Larry the Bird</td>
                      <td>A123</td>
                      <td>1/3/1983</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">1</th>
                      <td>Mark Otto</td>
                      <td>A121</td>
                      <td>1/1/1981</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td>Jacob Thornton</td>
                      <td>A122</td>
                      <td>1/2/1982</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>
                    <tr>
                      <th scope="row">3</th>
                      <td>Larry the Bird</td>
                      <td>A123</td>
                      <td>1/3/1983</td>
                      <td>Kinh tế - Quản lý</td>
                      <td>Quản trị du lịch</td>
                      <td>Bình thường</td>
                      <td><a href="giaovien-chitiet.html"><i class="fas fa fa-address-card"></i></a></td> <!-- button Hồ sơ giáo viên -->
                      <td><a href="hosokham-chitiet.html"><i class="fas fa fa-plus-square"></i></a></td> <!-- button Hồ sơ khám-->
                      <td><a href="sua-giaovien.html"><i class="fas fa fa-edit"></i></a></td> <!-- button Sửa -->
                      <td><a href="#"><i class="fas fa fa-trash"></i></a></td> <!-- button Xóa -->
                    </tr>

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