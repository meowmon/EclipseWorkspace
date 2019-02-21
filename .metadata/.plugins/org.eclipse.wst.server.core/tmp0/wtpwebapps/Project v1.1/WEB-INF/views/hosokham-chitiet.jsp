<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <link rel="shortcut icon" type="image/png" href="assets/img/LogoTLU.png"/>
    <title>Hệ thống quản lý sức khỏe</title>

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
            <p class="navbar-brand" href="#pablo">Quản lý Giáo viên</p>
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
                <li  >
                    <a href="khoa.html">Quản lý Khoa</a>
                </li>
                 <li>
                    <a href="bomon.html">Quản lý Bộ Môn</a>
                </li>
                <li class="active">
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
              <div>
                  <image src="assets/img/LogoTLU.png" class="container-fluid mb-3 mt--2"> </image>
               </div>
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

                <!-- Main  --> 
        <div class="">

          
            <nav class="navbar topnav marb-10">
              <form class="card-body card no-padding" items="${file}" var="file">

                <div class="form-group row no-margin">
                  <div class="col-md-6">
                  <label for="staticEmail" class="col-md-4 col-form-label auto-w">Họ tên :</label>
                  <input type="text" readonly class=" col-form-label auto-w no-margin" id="staticEmail" value="${file.userName}">
                  </div>

                  <div class="col-md-6">
                  <label for="staticEmail" class="col-md-4 col-form-label auto-w">Mã hồ sơ :</label>
                  <input type="text" readonly class=" col-form-label auto-w no-margin" id="staticEmail" value="EF${file.examfileId }">
                  </div>
                </div>

                <div class="form-group row no-margin">
                  <div class="col-md-6">
                  <label for="staticEmail" class="col-md-4 col-form-label auto-w">Mã giáo viên :</label>
                  <input type="text" readonly class=" col-form-label auto-w no-margin" id="staticEmail" value="G${file.userId }">
                  </div>

                  <div class="col-md-6">
                  <label for="staticEmail" class="col-md-4 col-form-label auto-w">Ngày khám :</label>
                  <input type="date" readonly class=" col-form-label auto-w no-margin" id="staticEmail" value="${file.date}">
                  </div>
                </div>

              </form>
            </nav>
         <div class="line_20"></div>

        
            <nav class="navbar navbar-expand-lg navbar-light bg-light topnav marb-10">
                <div class="container-fluid">
                    <li class="nav-item list-item">
                        <div class="dropdown show">
                            <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Kỳ khám bệnh
                          </a>

                          <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="#">Kỳ khám bệnh 1</a>
                            <a class="dropdown-item" href="#">Kỳ khám bệnh 2</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                          </div>
                        </div>
                    </li>
                </div>
            </nav>


            <nav class="navbar navbar-expand-lg navbar-light bg-light topnav marb-10">
                <div class="container-fluid">
                    
                    <li class="nav-item list-item">
                        <a href="xetnghiemmau.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-danger">
                                  <i class="fas fa fa-tint"></i>
                                  <span>Hồ sơ Xét nghiệm máu cơ bản</span>
                          </button>
                        </a>
                    </li>


                    <li class="nav-item list-item">
                        <a href="sieuam.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-warning">
                                  <i class="fas fa fa-assistive-listening-systems"></i>
                                  <span>Hồ sơ Siêu âm</span>
                          </button>
                        </a>
                    </li>


                    <li class="nav-item list-item">
                        <a href="x-quang.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-info">
                                  <i class="fas fa fa-user-circle"></i>
                                  <span>Hồ sơ Chụp X-Quang phổi</span>
                          </button>
                        </a>
                    </li>
                    <li class="nav-item list-item"></li>
                    <li class="nav-item list-item"></li>
                    <!--
                    <li class="nav-item list-item">
                        <a href="khamnoi.html">
                          <button type="button" id="sidebarCollapse" class="btn btn-success">
                                  <i class="fas fa fa-street-view"></i>
                                  <span>Hồ sơ Khám nội tổng quát</span>
                          </button>
                        </a>
                    </li>
                    -->
                    
                </div>
            </nav>

            <form class="card-body card" items="${detail}" var="detail">


              <div class="border-gray">
                    <h5>Chỉ số sơ bản</h5>
                    <div class="line_20"></div>

                  <div class="form-row">
                    <div class="col-md-3 mb-4 mr-2">
                        <label for="validationDefault01">Mắt trái</label>
                        <div class="input-group">
                        <span class="input-group-text">${detail.leftEye }</span>
                     	<div class="input-group-append">
                        <span class="input-group-text">/ 10</span>
                          </div>
                        </div>
                    </div>

                    <div class="col-md-3 mb-4">
                        <label for="validationDefault01">Mắt phải</label>
                        <div class="input-group">
                         <span class="input-group-text">${detail.rightEye}</span>
                        <span class="input-group-text">/ 10</span>
                          </div>
                        </div>
                    </div>
                 
                  </div>


                  <div class="form-row">
                    <div class="col-md-3 mb-4 mr-2">
                        <label for="validationDefault01">Chiều cao</label>
                        <div class="input-group">
                        <span class="input-group-text">${detail.height}</span>
                        <div class="input-group-append">
                        <span class="input-group-text">cm</span>
                          </div>
                        </div>
                    </div>

                    <div class="col-md-3 mb-4 mr-2">
                        <label for="validationDefault01">Cân nặng</label>
                        <div class="input-group">
                          <span class="input-group-text">${detail.weight}</span>
                          <div class="input-group-append">
                        <span class="input-group-text">kg</span>
                          </div>
                        </div>
                    </div>

                    <div class="col-md-3 mb-4">
                        <label for="validationDefault01">BMI</label>
                        <div class="input-group">
                          <span class="input-group-text">${detail.BMI}</span>
                        </div>
                    </div>
                 
                

                  </div>
             
                <div class="form-row">

                      <div class="col-md-3 mb-2 mr-2">
                        <label for="validationDefault01">Mạch</label>
                        <div class="input-group">
                          <span class="input-group-text">${detail.beat}</span>
                          <div class="input-group-append">
                        <span class="input-group-text">lần/phút</span>
                          </div>
                        </div>
                    </div>
                    <div class="col-md-3 mb-2 mr-2">
                        <label for="validationDefault01">Huyết áp</label>
                        <div class="input-group">
                          <span class="input-group-text">${detail.pressure}</span>
                          <div class="input-group-append">
                        <span class="input-group-text">mmHg</span>
                          </div>
                        </div>
                    </div>

                     <div class="col-md-4 mb-2">
                        <label for="validationDefault01">Phân loại thể lực</label>
                          <span class="input-group-text">${detail.pclass}</span>
                        </div>
                    </div>
                </div>


              <div class="form-row" items="${file}" var="file">
                <div class="col-md-8 mb-3">
                  <label for="validationDefault01">Mô tả</label>
                  <span class="input-group-text">${file.descrip}</span>
                </div>
              </div>

              <div class="form-row">
                <div class="col-md-8 mb-3">
                  <label for="validationDefault01">Kết luận</label>
                  <span class="input-group-text">${file.conclude}</span>
                </div>
              </div>

              <div class="form-row">                   <!--    Set role for user    -->
                <div class="col-md-3 mb-3">
                  <label for="inputState">Trạng thái</label>      
                  <span class="input-group-text">${detail.status}</span>
                  </select>
                </div>
              </div>
            </form>

             <div class="line_20"> </div>
            <a href="giaovien.html"><button class="btn btn-default" type="button">Trở lại</button></a>
            <button class="btn btn-primary" type="submit">Lưu</button>
            
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